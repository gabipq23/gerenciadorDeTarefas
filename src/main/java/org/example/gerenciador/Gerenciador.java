package org.example.gerenciador;

import org.example.tarefas.*;
import org.example.usuarios.*;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador
{
    public static void main( String[] args )
    {
        Tarefa tarefa1 = new Tarefa("Arrumar armário.", "Ana");
        Tarefa tarefa2 = new Tarefa("Colocar os livros nas mesas.", "João");
        Tarefa tarefa3 = new Tarefa("Comprar as canetas.", "Pedro");

        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(tarefa1);
        tarefas.add(tarefa2);
        tarefas.add(tarefa3);

        ListaDeUsuarios listaDeUsuarios = new ListaDeUsuarios(tarefas);

        System.out.println("Membros da equipe: ");
        for(Usuario usuario: listaDeUsuarios.getUsuarios()){
            System.out.println(usuario.getNome());
        }

        System.out.println("-=");
        System.out.println("Descrição de tarefas:");
        for (Tarefa tarefa: tarefas){
            System.out.println(tarefa);
        }
    }
}