package org.example.usuarios;

import lombok.Getter;

public class Usuario {
    @Getter
    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }
}
