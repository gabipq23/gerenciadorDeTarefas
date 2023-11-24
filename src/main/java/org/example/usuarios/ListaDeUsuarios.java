package org.example.usuarios;

import lombok.Getter;
import org.example.tarefas.*;

import java.util.ArrayList;
import java.util.List;
public class ListaDeUsuarios {
    @Getter
    private List<Usuario> usuarios;

    public ListaDeUsuarios(List<Tarefa> tarefas) {
        usuarios = new ArrayList<>();
        for (Tarefa tarefa : tarefas){
            String responsavel = tarefa.getResponsavel();
            if(!usuarioJaFoiAdicionado(responsavel)){
                usuarios.add(new Usuario(responsavel));
            }
        }
    }

    private boolean usuarioJaFoiAdicionado(String nome){
        for(Usuario usuario : usuarios){
            if (usuario.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
}