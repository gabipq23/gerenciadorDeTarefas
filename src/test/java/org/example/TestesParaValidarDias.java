//package org.example;
//
//import junit.framework.Test;
//import junit.framework.TestCase;
//import junit.framework.TestSuite;
//
///**
// * Unit test for simple App.
// */
//public class AppTest
//    extends TestCase
//{
//    /**
//     * Create the test case
//     *
//     * @param testName name of the test case
//     */
//    public AppTest( String testName )
//    {
//        super( testName );
//    }
//
//    /**
//     * @return the suite of tests being tested
//     */
//    public static Test suite()
//    {
//        return new TestSuite( AppTest.class );
//    }
//
//    /**
//     * Rigourous Test :-)
//     */
//    public void testApp()
//    {
//        assertTrue( true );
//    }
//}

package org.example;

import org.example.tarefas.Tarefa;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import  static org.junit.jupiter.api.Assertions.*;
public  class TestesParaValidarDias {
    @Test
    @DisplayName("Digitar aqui o que esse teste faz; ex: Deve testar a sina de dois inteiros.")
    public void test1(){
        Tarefa tarefa = new Tarefa("Tarefa", "Responsável", 4);
        assertEquals(4, tarefa.getDiasParaConcluir());
    }
    @Test
    @DisplayName("Teste para quando usuario informa um dia impar")
    public void test2(){
        Tarefa tarefa = new Tarefa("Tarefa", "Responsável", 5);
        assertEquals(6, tarefa.getDiasParaConcluir());
    }
    @Test
    @DisplayName("Teste para quando o usuario informa um dia menor que zero")
    public void test3(){
        assertThrows(IllegalArgumentException.class, () -> {
            Tarefa tarefa = new Tarefa("Tarefa", "Responsável", -1);} );
    }
    @Test
    @DisplayName("Teste para quando o usuario informa o numero zero")
    public void test4(){
        assertThrows(IllegalArgumentException.class, () -> {
            Tarefa tarefa = new Tarefa("Tarefa", "Responsável", 0);} );
    }
}