package ex05;

import java.util.HashSet;
import java.util.Set;
public class Exercicio05 {
    public static void main(String[] args) {
        Set<String> nomes = new HashSet<>();
        System.out.println("Primeira inserção: " + nomes.add("Ana"));
        System.out.println("Segunda inserção: " + nomes.add("Ana")); // false: duplicado ignorado
        System.out.println("Tamanho do Set: " + nomes.size() + " (uma List teria 2)");
    }
}
