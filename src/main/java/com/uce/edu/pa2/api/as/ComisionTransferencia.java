package com.uce.edu.pa2.api.as;

import java.math.BigDecimal;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(2)
public class ComisionTransferencia implements OperacionBancaria {

    @Override
    public void procesar(Transferencia transferencia) {

        Cuenta origen = transferencia.getCuentaOri();
        double total = origen.getSaldo() - Double.valueOf(0.35);
        System.out.println("Saldo origen despues de comision: "+total);
        origen.setSaldo(total);

        System.out.println("Comisión cobrada");
    }
}
