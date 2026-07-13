package br.com.alura.screenmatch.tarefa.aula02;


/*Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo.
A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.*/

import java.util.function.BinaryOperator;

@FunctionalInterface
interface Divisor {
    int dividir(int a, int b) throws ArithmeticException;
}

public class Tarefa7 {
    public static void main (String[] args){
        BinaryOperator<Integer> dividir = (a,b)  -> {
            if (b == 0) throw new  ArithmeticException("Divisão por zero");
            return a / b;
        };

        try {
            System.out.println(dividir.apply(10,2));
            System.out.println(dividir.apply(10,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
