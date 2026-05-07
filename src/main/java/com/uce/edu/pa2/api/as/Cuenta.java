package com.uce.edu.pa2.api.as;

public class Cuenta {
    private String nombre;
    private String cedula;
    private Double saldo;
    public Cuenta(){
        
    }
    public Cuenta(String nombre, String cedula, Double saldo) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.saldo = saldo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCedula() {
        return cedula;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    
}
