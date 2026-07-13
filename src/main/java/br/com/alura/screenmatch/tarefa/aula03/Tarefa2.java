package br.com.alura.screenmatch.tarefa.aula03;

import java.util.Arrays;
import java.util.List;

/*Dada a lista de strings abaixo, converta
todas para letras maiúsculas e imprima-as.*/

public class Tarefa2 {
    public static void main(String[] args) {
        List<String> palavras = Arrays.asList("java", "stream", "lambda");
        palavras.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }
}
