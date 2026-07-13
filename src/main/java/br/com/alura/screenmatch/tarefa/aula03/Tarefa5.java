package br.com.alura.screenmatch.tarefa.aula03;

import com.sun.tools.javac.Main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*Dada a lista de sublistas de números inteiros abaixo,
extraia todos os números primos em uma única lista e
os ordene em ordem crescente.*/

public class Tarefa5 {
    public static void main(String[] args) {
        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1, 2, 3, 4),
                Arrays.asList(5, 6, 7, 8),
                Arrays.asList(9, 10, 11, 12)
        );
        List<Integer> novaLista = listaDeNumeros.stream()
                .flatMap(List::stream)
                .filter(Tarefa5::ehPrimo)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(novaLista);
    }

    private static boolean ehPrimo(int numero){
       if (numero == 1) return false;
       if (numero == 2) return true;
       if (numero % 2 == 0) return false;
       for (int i = 3; i<=Math.sqrt(numero); i+=2){
           if (numero % i == 0) return false;
       }
        return true;
    }
}
