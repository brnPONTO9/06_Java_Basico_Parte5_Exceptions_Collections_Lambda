package ex18;

import java.util.*;
public class Exercicio18 {
    record Produto(String nome, double preco) {}
    public static void main(String[] args) {
        List<Produto> ps = new ArrayList<>(List.of(new Produto("Monitor", 900), new Produto("Mouse", 80), new Produto("Teclado", 150)));
        ps.sort(Comparator.comparingDouble(Produto::preco));
        ps.forEach(System.out::println);
    }
}
