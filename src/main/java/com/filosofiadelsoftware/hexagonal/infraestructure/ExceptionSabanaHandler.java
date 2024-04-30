package com.filosofiadelsoftware.hexagonal.infraestructure;

import com.filosofiadelsoftware.hexagonal.application.exception.CuentaNoExisteException;
import com.filosofiadelsoftware.hexagonal.infraestructure.out.dto.ErrorDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class ExceptionSabanaHandler {

  @ExceptionHandler(CuentaNoExisteException.class)
  public ResponseEntity handlerCuentaNoExiste(CuentaNoExisteException ex) {
    log.info("Se intento realizar operación con cuenta no existente ", ex);
    return ResponseEntity
        .status(HttpStatus.UNPROCESSABLE_ENTITY)
        .body(
            new ErrorDTO(ex.getMessage(), HttpStatus.UNPROCESSABLE_ENTITY.value(),
                "CONSTANTE_DEL_ERROR_1"));
  }

  @ExceptionHandler(Exception.class)
  public ResponseEntity handlerGeneral(Exception ex) {
    //log.error("");
    return ResponseEntity
        .status(HttpStatus.INTERNAL_SERVER_ERROR)
        .body(ex.getMessage());
  }
}
