package br.com.alura.screenmatch.tarefa.aual04;

import java.util.Arrays;
import java.util.List;

/*Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.*/

public class Tarefa4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);
        int somaDosQuadrados = numeros.stream()
                .filter(n -> n%2 == 0)
                .map( n -> n * n)
                .reduce(0, Integer::sum);
        System.out.println(somaDosQuadrados);
    }
}
