package ex34;

import java.util.*;
public class Exercicio34 {
    static class Produto {
        final int id; final String nome;
        Produto(int id, String nome) { this.id = id; this.nome = nome; }
        @Override public boolean equals(Object o) { return o instanceof Produto p && p.id == id; }
        @Override public int hashCode() { return Integer.hashCode(id); }
        @Override public String toString() { return id + ":" + nome; }
    }
    public static void main(String[] args) {
        Set<Produto> set = new HashSet<>();
        System.out.println(set.add(new Produto(1, "Mouse")));
        System.out.println(set.add(new Produto(1, "Mouse (outro nome)"))); // false: mesmo id
        System.out.println(set.add(new Produto(2, "Teclado")));
        System.out.println(set.size() + " elementos: " + set);
    }
}
