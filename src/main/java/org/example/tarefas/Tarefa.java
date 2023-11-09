package org.example.tarefas;


import lombok.Getter;
import lombok.Setter;

public class Tarefa {
    @Getter@Setter
    private  String descricao;
    @Getter@Setter
    private String responsavel;

    public Tarefa (String descricao, String responsavel){
        this.descricao = descricao;
        this.responsavel = responsavel;
    }


    public String toString(){
        return responsavel + " vai " + descricao.toLowerCase();
    }
}
