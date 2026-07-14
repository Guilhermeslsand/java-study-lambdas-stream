package br.com.alura.screenmatch.tarefa.aual04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Dada a lista de nomes abaixo, concatene-os separados por vírgula.
No código a seguir, há um exemplo prático do resultado esperado.*/

public class Tarefa3 {
    public static void main(String[] args){
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        String resultado = nomes.stream()
                .collect(Collectors.joining(", "));
        System.out.println(resultado);
    }
}
