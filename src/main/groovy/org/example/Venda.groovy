package org.example

class Venda {
    double valor
    Cliente cliente
    ICredito creditoService

    // construtor:
    Venda(double valor, Cliente cliente, ICredito creditoService) {
        super()
        this.valor = valor
        this.cliente = cliente
        this.creditoService = creditoService
    }

    boolean checkout() {
        try {
            double limite = creditoService.getLimite(cliente.getCpf())
            if (valor > limite)
                return false
        }
        catch (RuntimeException e) {
            return false
        }
        return true
    }
}
