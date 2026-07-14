package br.com.alura.screenmatch.tarefa.aual04;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/* Dada a lista de números inteiros a seguir, encontre o maior número dela.*/

public class Tarefa1 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(10, 20, 30, 40, 50);
        Optional<Integer> max = numeros.stream().max(Integer::compare);
        max.ifPresent(System.out::println);
    }
}
