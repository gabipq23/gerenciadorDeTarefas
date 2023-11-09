package org.example.tarefas;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
public class ListaDeTarefas {
    @Getter
    private List<Tarefa> tarefas;

    public ListaDeTarefas() {
       tarefas = new ArrayList<>();
    }

}
