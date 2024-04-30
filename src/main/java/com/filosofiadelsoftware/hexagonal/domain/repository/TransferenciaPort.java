package com.filosofiadelsoftware.hexagonal.domain.repository;


import com.filosofiadelsoftware.hexagonal.domain.entity.Cuenta;
import java.util.UUID;

public interface TransferenciaPort {

  UUID guardarTransaccion(Cuenta cuentaOrigen, Cuenta cuentaDestino, int monto);
}
