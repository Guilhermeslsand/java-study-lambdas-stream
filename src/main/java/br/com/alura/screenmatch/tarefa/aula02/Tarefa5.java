package br.com.alura.screenmatch.tarefa.aula02;

/*Implemente uma expressão lambda que recebe uma lista de inteiros
e retorna uma nova lista onde cada número foi multiplicado por 3.
Dica: a função replaceAll, das Collections, recebe uma interface
funcional como parâmetro, assim como vimos na função forEach.*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class Tarefa5 {
    public static void main (String[] args){
        List<Integer> lista = List.of(1,2,3,4,5);
//        List<Integer> lista1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        List<Integer> listaNova = lista.stream().map(n -> n * 3).toList();
        System.out.println(listaNova);
    }
}
