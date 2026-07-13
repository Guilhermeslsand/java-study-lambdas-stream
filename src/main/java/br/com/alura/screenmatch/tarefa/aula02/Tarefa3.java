package br.com.alura.screenmatch.tarefa.aula02;

/*Crie uma função lambda que receba uma string e a converta para letras maiúsculas.*/

@FunctionalInterface
interface ToMaisculo{
    String toMaisculo(String s);
}

public class Tarefa3 {
    public static void main(String[] args){
        ToMaisculo tarefa = s -> s.toUpperCase();
        System.out.println(tarefa.toMaisculo("java"));
    }
}
