package org.example.tarefas;

import lombok.Getter;
import lombok.Setter;

public class Tarefa {
    @Getter
    @Setter
    private String descricao;
    @Getter
    @Setter
    private String responsavel;
    @Getter
    private int diasParaConcluir;

    public Tarefa(String descricao, String responsavel, int diasParaConcluir) {
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.diasParaConcluir = validarDias(diasParaConcluir);
    }

    public String toString() {
        return responsavel + " vai " + descricao.toLowerCase() + " em " + diasParaConcluir + " dia(s).";
    }

    private int validarDias(int diasParaConcluir) {
        if (diasParaConcluir <= 0){
            throw new IllegalArgumentException("O número de dias informado deve ser maior que zero(0).");
        }
        return diasParaConcluir % 2 == 0 ? diasParaConcluir : diasParaConcluir +1;

    }
}
