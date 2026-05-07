package com.uce.edu.pa2.api.as;

public class Transferencia {
    private Cuenta cuentaOri;
    private Cuenta cuentaDes;
    private double monto;
    
    public Transferencia(){

    }
    public Transferencia(Cuenta cuentaOri, Cuenta cuentaDes, double monto) {
        this.cuentaOri = cuentaOri;
        this.cuentaDes = cuentaDes;
        this.monto = monto;
    }
    public Cuenta getCuentaOri() {
        return cuentaOri;
    }
    public void setCuentaOri(Cuenta cuentaOri) {
        this.cuentaOri = cuentaOri;
    }
    public Cuenta getCuentaDes() {
        return cuentaDes;
    }
    public void setCuentaDes(Cuenta cuentaDes) {
        this.cuentaDes = cuentaDes;
    }
    public double getMonto() {
        return monto;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    

}
