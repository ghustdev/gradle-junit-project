package org.example

import groovy.transform.ToString

@ToString
class Cliente {
    String cpf
    String nome

    // Não precisa de construtor - mas implementei
    // Não precisa de getters/setters

    Cliente(String cpf, String nome) {
        if (!cpf) throw new IllegalArgumentException("CPF obrigatório")
        this.cpf = cpf
        this.nome = nome
    }
}
