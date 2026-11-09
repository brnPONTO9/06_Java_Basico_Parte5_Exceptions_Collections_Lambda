package ex39;

import java.util.List;
import java.util.function.Function;
public class Exercicio39 {
    record Produto(String nome, double preco, int estoque) {}
    public static void main(String[] args) {
        Function<Produto, String> linha = p -> String.format("%-10s R$ %8.2f  estoque: %d", p.nome(), p.preco(), p.estoque());
        List.of(new Produto("Mouse", 80, 10), new Produto("Monitor", 900, 0)).stream().map(linha).forEach(System.out::println);
    }
}
