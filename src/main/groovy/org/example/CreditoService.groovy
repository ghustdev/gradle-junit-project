package org.example

class CreditoService implements ICredito {
    @Override
    double getLimite(String cpf) {
        // acessa webservice
        println "consultando webservices"
        return 1500
    }
}
