package br.com.alura.screenmatch.tarefa.aual04;

/*Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.
No código a seguir, há um exemplo prático do resultado esperado.*/

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tarefa2 {
    public static void main(String[] args){
        List<String> palavras = Arrays.asList("java", "stream", "lambda", "code");

        Map<Integer, List<String>> agrupamento = palavras.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println(agrupamento);
    }
}
