package com.filosofiadelsoftware.hexagonal.application.port.in;

import com.filosofiadelsoftware.hexagonal.application.usecase.ConsignarDTO;

public interface IConsignarDinero {

  void consignarDinero(ConsignarDTO dto);
}
