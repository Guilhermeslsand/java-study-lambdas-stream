package br.com.alura.screenmatch.tarefa.aula02;

/*Crie uma expressão lambda que multiplique dois números inteiros.
A expressão deve ser implementada dentro de uma interface funcional
com o método multiplicacao(int a, int b).*/

@FunctionalInterface
interface Multiplicacao{
    int multiplicacao (int a, int b);
}

public class Tarefa1 {
    public static void main(String[] args){
        Multiplicacao tarefa = (a,b) -> a * b;
        System.out.println("Multiplicacao: "+tarefa.multiplicacao(5,3));
    }
}
