package com.filosofiadelsoftware.hexagonal.infraestructure.out.persistence.adapter;

import com.filosofiadelsoftware.hexagonal.domain.entity.Cuenta;
import com.filosofiadelsoftware.hexagonal.domain.repository.CuentaRepository;
import com.filosofiadelsoftware.hexagonal.infraestructure.out.persistence.orm.CuentaORM;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CuentaAdapterRepository implements CuentaRepository {

  private final com.filosofiadelsoftware.hexagonal.infraestructure.out.persistence.adapter.repository.CuentaRepository CuentaRepo;

  public CuentaAdapterRepository(com.filosofiadelsoftware.hexagonal.infraestructure.out.persistence.adapter.repository.CuentaRepository cuentaRepo) {
    CuentaRepo = cuentaRepo;
  }

  @Override
  public Cuenta obtenerCuenta(int numCuenta) {
    Optional<CuentaORM> byId = CuentaRepo.findById(numCuenta);
    byId.ifPresent(CuentaORM::converToModel);
    return null;
  }

  @Override
  public void actualizarSaldo(Cuenta cuenta) {
    CuentaORM cuentaORM = CuentaRepo.findById(cuenta.getNumeroCuenta()).get();
    cuentaORM.setSaldo(cuenta.getSaldo());
    CuentaRepo.save(cuentaORM);
  }
}
