package ex33;

import java.util.*;
public class Exercicio33 {
    static class Servico {
        private final List<String> interna = new ArrayList<>(List.of("A", "B"));
        List<String> listar() { return List.copyOf(interna); } // cópia imutável
        void adicionar(String s) { interna.add(s); }
    }
    public static void main(String[] args) {
        Servico s = new Servico();
        List<String> copia = s.listar();
        try { copia.add("X"); } catch (UnsupportedOperationException e) { System.out.println("Chamador não pode modificar: UnsupportedOperationException"); }
        s.adicionar("C");
        System.out.println("Cópia antiga: " + copia + " | nova: " + s.listar());
    }
}
