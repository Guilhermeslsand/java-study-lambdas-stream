package br.com.alura.screenmatch.tarefa.aula02;

/*Implemente uma expressão lambda que verifique se um número é primo.*/

@FunctionalInterface
interface EhPrimo{
    boolean ehPrimo(int a);
}

public class Tarefa2 {
    public static void main(String[] args){
        EhPrimo tarefa = (n) -> {
            // 1 não é primo
            if (n <=1) return  false;
            // 2 é primo
            if (n  == 2) return true;
            // Todo numero par não é primo
            if (n % 2 == 0) return false;
            // Verficando os numeros impares para ver qual não é primo
            for (int i = 3; i<= Math.sqrt(n); i+=2){
                if (n % i == 0) return false;
            }
            return true;
        };
        System.out.println(tarefa.ehPrimo(47));
        System.out.println(tarefa.ehPrimo(49));
    }
}
