package br.com.alura.screenmatch.tarefa.aula03;

import java.util.Arrays;
import java.util.List;

/*Dada a lista de strings abaixo, remova as
duplicatas (palavras que aparecem mais de uma vez)
e imprima o resultado.*/
public class Tarefa4 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("apple", "banana", "apple", "orange", "banana");
        palavras.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
