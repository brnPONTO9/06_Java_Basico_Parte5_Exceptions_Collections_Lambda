package ex40;

import java.util.*;
public class Exercicio40 {
    record Produto(String nome, double preco, int estoque) {}
    public static void main(String[] args) {
        List<Produto> ps = List.of(new Produto("Monitor", 900, 3), new Produto("Mouse", 80, 10), new Produto("Webcam", 250, 0), new Produto("Teclado", 150, 5));
        List<String> nomes = ps.stream()
                .filter(p -> p.estoque() > 0)
                .sorted(Comparator.comparingDouble(Produto::preco))
                .map(Produto::nome)
                .toList();
        System.out.println(nomes);
    }
}
