package org.example.gerenciador;

import org.example.tarefas.*;
import org.example.usuarios.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Gerenciador.class);
    public static void main( String[] args )
    {
        LOGGER.info("Iniciando o programa");
        Tarefa tarefa1 = new Tarefa("Arrumar armário", "Ana", 2);
        Tarefa tarefa2 = new Tarefa("Colocar os livros nas mesas", "João", 3);
        Tarefa tarefa3 = new Tarefa("Comprar as canetas", "Pedro", 8);

        List<Tarefa> tarefas = new ArrayList<>();

        try{
            tarefas.add(tarefa1);
            tarefas.add(tarefa2);
            tarefas.add(tarefa3);
        }
        catch (Exception ex){
            LOGGER.error("Erro ao adicionar tarefa: " + ex.getMessage());
        }

        ListaDeUsuarios listaDeUsuarios = new ListaDeUsuarios(tarefas);

        LOGGER.info("Membros da equipe: ");
        for(Usuario usuario: listaDeUsuarios.getUsuarios()){
            LOGGER.debug(usuario.getNome());
        }

        LOGGER.info("Descrição de tarefas:");
        for (Tarefa tarefa: tarefas){
            LOGGER.debug(tarefa.toString());
        }
        LOGGER.info("Programa finalizado.");


    }
}