package ex47;

import java.util.List;
import java.util.function.Predicate;
public class Exercicio47 {
    record Produto(String nome, double preco, int estoque) {}
    public static void main(String[] args) {
        Predicate<Produto> emEstoque = p -> p.estoque() > 0;
        Predicate<Produto> barato = p -> p.preco() < 100;
        Predicate<Produto> promo = p -> p.nome().startsWith("M");
        List<Produto> ps = List.of(new Produto("Mouse", 80, 10), new Produto("Monitor", 900, 3), new Produto("Cabo", 20, 0), new Produto("Teclado", 150, 5));
        System.out.println("em estoque E barato: " + ps.stream().filter(emEstoque.and(barato)).map(Produto::nome).toList());
        System.out.println("barato OU promo: " + ps.stream().filter(barato.or(promo)).map(Produto::nome).toList());
        System.out.println("NÃO em estoque: " + ps.stream().filter(emEstoque.negate()).map(Produto::nome).toList());
    }
}
