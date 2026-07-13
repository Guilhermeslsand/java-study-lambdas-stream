package br.com.alura.screenmatch.tarefa.aula03;

/*Tomando o mesmo código do exercício anterior como base,
modifique o código para que a saída mostre apenas os três
produtos mais baratos da categoria "Eletrônicos".*/

import java.util.Arrays;
import java.util.List;

public class Tarefa8 {
    public static void main(String[] args) {
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );
        produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos") )
                .sorted((p1,p2) -> Double.compare(p1.getPreco(),p2.getPreco()))
                .limit(3)
                .forEach(System.out::println);
    }
}
