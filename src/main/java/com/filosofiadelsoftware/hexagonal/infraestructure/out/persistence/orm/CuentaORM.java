package com.filosofiadelsoftware.hexagonal.infraestructure.out.persistence.orm;

import com.filosofiadelsoftware.hexagonal.domain.entity.Cuenta;
import com.filosofiadelsoftware.hexagonal.domain.enums.TipoCuenta;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class CuentaORM {

  @Id
  @Column
  private int numeroCuenta;

  @Column
  private int saldo;

  @Column
  private int propietario;

  @Column
  private TipoCuenta tipoCuenta;

  @Column
  private String ciudadApertura;

  @Column
  private String asesorAperturo;
  @Column
  private String oficina;
  @Column
  private Date fechaApertura;
  @Column
  private Date fechaUltimaModificacion;

  public Cuenta converToModel() {
    return new Cuenta(this.numeroCuenta, this.saldo, this.propietario, this.tipoCuenta);
  }

  public int getNumeroCuenta() {
    return numeroCuenta;
  }

  public void setNumeroCuenta(int numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
  }

  public int getPropietario() {
    return propietario;
  }

  public void setPropietario(int propietario) {
    this.propietario = propietario;
  }

  public TipoCuenta getTipoCuenta() {
    return tipoCuenta;
  }

  public void setTipoCuenta(TipoCuenta tipoCuenta) {
    this.tipoCuenta = tipoCuenta;
  }

  public String getCiudadApertura() {
    return ciudadApertura;
  }

  public void setCiudadApertura(String ciudadApertura) {
    this.ciudadApertura = ciudadApertura;
  }

  public String getAsesorAperturo() {
    return asesorAperturo;
  }

  public void setAsesorAperturo(String asesorAperturo) {
    this.asesorAperturo = asesorAperturo;
  }

  public String getOficina() {
    return oficina;
  }

  public void setOficina(String oficina) {
    this.oficina = oficina;
  }

  public Date getFechaApertura() {
    return fechaApertura;
  }

  public void setFechaApertura(Date fechaApertura) {
    this.fechaApertura = fechaApertura;
  }

  public Date getFechaUltimaModificacion() {
    return fechaUltimaModificacion;
  }

  public void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
    this.fechaUltimaModificacion = fechaUltimaModificacion;
  }
}
