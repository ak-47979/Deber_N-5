package com.uce.edu.pa2.api.as;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Instance;
import jakarta.inject.Inject;

@ApplicationScoped
public class ProcesarTransferencia {

    @Inject
    Instance<OperacionBancaria> procesadores;

    public void transferir(Transferencia transferencia){
        
        try {

            for(OperacionBancaria p : procesadores){
                p.procesar(transferencia);
            }

        } catch (RuntimeException e){

            System.out.println(e.getMessage());
        }
    }
}