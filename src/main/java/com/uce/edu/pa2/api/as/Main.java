package com.uce.edu.pa2.api.as;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import jakarta.inject.Inject;

public class Main {

    public static void main(String... args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication {
        @Inject
        private ProcesarTransferencia procesarTransferencia;

        @Override
        public int run(String... args) throws Exception {
            Cuenta cuentaOri = new Cuenta("Andy Suquilandi", "1753025459", 210.0);
            Cuenta cuentaDes = new Cuenta("Alan Aranda", "1754321154", 75.0);
            Transferencia transferencia = new Transferencia(cuentaOri, cuentaDes, 100);
            this.procesarTransferencia.transferir(transferencia);

            return 0;
        } 
    }

}
