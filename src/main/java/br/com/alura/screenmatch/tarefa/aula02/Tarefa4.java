package br.com.alura.screenmatch.tarefa.aula02;

/*Crie uma expressão lambda que verifique se uma string é um palíndromo.
A expressão deve ser implementada dentro de uma interface funcional com o
método boolean verificarPalindromo(String str). Dica: utilize o método reverse
da classe StringBuilder.*/

@FunctionalInterface
interface Palindromo{
    boolean verficarPalindromo(String s);
}

public class Tarefa4 {
    public static void main(String[] args){
        Palindromo tarefa = s -> s.equals(new StringBuilder(s).reverse().toString());
        System.out.println(tarefa.verficarPalindromo("radar"));
        System.out.println(tarefa.verficarPalindromo("java"));
    }
}
