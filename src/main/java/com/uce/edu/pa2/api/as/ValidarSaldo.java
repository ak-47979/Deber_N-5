package com.uce.edu.pa2.api.as;

import jakarta.annotation.Priority;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@Priority(3)
public class ValidarSaldo implements OperacionBancaria{

    
    @Override
    public void procesar(Transferencia transferencia) {

        if(transferencia.getCuentaOri().getSaldo()< transferencia.getMonto()+0.35){

            throw new RuntimeException(
                    "Saldo insuficiente, no se puede realizar la transferencia"
            );
        }

        System.out.println("Validacion Exitosa!");
    }
}

    

