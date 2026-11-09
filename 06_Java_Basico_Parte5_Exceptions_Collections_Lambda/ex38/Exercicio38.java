package ex38;

import java.util.*;
public class Exercicio38 {
    record Pessoa(String nome, int idade) {}
    public static void main(String[] args) {
        List<Pessoa> ps = new ArrayList<>(List.of(new Pessoa("Carla", 30), new Pessoa("Ana", 25), new Pessoa("Bruno", 20)));
        // 1) classe anônima
        ps.sort(new Comparator<Pessoa>() {
            @Override public int compare(Pessoa a, Pessoa b) { return a.nome().compareTo(b.nome()); }
        });
        System.out.println("Anônima: " + ps);
        // 2) lambda
        ps.sort((a, b) -> Integer.compare(a.idade(), b.idade()));
        System.out.println("Lambda (idade): " + ps);
        // 3) Comparator.comparing
        ps.sort(Comparator.comparing(Pessoa::nome));
        System.out.println("comparing (nome): " + ps);
    }
}
