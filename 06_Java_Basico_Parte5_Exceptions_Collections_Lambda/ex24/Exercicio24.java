package ex24;

import java.util.*;
public class Exercicio24 {
    record Produto(int id, String nome, double preco) {}
    static class Catalogo {
        private final Map<Integer, Produto> dados = new HashMap<>();
        void cadastrar(Produto p) { dados.put(p.id(), p); }
        Optional<Produto> buscar(int id) { return Optional.ofNullable(dados.get(id)); }
        boolean remover(int id) { return dados.remove(id) != null; }
    }
    public static void main(String[] args) {
        Catalogo c = new Catalogo();
        c.cadastrar(new Produto(1, "Mouse", 80));
        c.cadastrar(new Produto(2, "Teclado", 150));
        System.out.println(c.buscar(1).orElse(null));
        System.out.println("Removido 2: " + c.remover(2));
        System.out.println("Buscar 2: " + c.buscar(2).isPresent());
    }
}
