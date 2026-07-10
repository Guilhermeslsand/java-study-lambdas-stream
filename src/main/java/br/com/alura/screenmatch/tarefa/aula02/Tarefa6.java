package br.com.alura.screenmatch.tarefa.aula02;

/*Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética.
Dica: a função sort, das Collections, recebe uma interface funcional como parâmetro,
assim como vimos na função forEach.*/

import java.util.Arrays;
import java.util.List;

public class Tarefa6 {
    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Lucas", "Maria", "João", "Ana","Guilherme");
        nomes.sort((a,b) -> a.compareTo(b));
        System.out.println(nomes);
    }
}
