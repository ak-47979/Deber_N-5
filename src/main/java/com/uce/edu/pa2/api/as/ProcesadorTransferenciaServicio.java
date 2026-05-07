package com.uce.edu.pa2.api.as;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(1)
public class ProcesadorTransferenciaServicio implements OperacionBancaria{

    @Override
    public void procesar(Transferencia transferencia) {
        
        double saldoOrigen = transferencia.getCuentaOri().getSaldo();
        double saldoDestino = transferencia.getCuentaDes().getSaldo();
        
         saldoOrigen = saldoOrigen - transferencia.getMonto();
         transferencia.getCuentaOri().setSaldo(saldoOrigen);
         saldoDestino = saldoDestino +transferencia.getMonto();
         transferencia.getCuentaDes().setSaldo(saldoDestino);
         System.out.println("Transferencia realizada");
         System.out.println("Saldo Origen despues de la transferencia:" + saldoOrigen);
         System.out.println("Saldo Destino despues de la transferencia:" + saldoDestino);
    }

    

}
