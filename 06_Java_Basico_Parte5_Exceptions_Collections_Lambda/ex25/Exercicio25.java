package ex25;

import java.util.*;
public class Exercicio25 {
    static long medirInicio(List<Integer> lista, int n) {
        long t = System.nanoTime();
        for (int i = 0; i < n; i++) lista.add(0, i); // inserir no início
        return (System.nanoTime() - t) / 1_000_000;
    }
    static long medirFim(List<Integer> lista, int n) {
        long t = System.nanoTime();
        for (int i = 0; i < n; i++) lista.add(i);
        return (System.nanoTime() - t) / 1_000_000;
    }
    public static void main(String[] args) {
        int n = 50_000;
        System.out.println("Inserir no início  - ArrayList: " + medirInicio(new ArrayList<>(), n) + " ms | LinkedList: " + medirInicio(new LinkedList<>(), n) + " ms");
        System.out.println("Inserir no fim     - ArrayList: " + medirFim(new ArrayList<>(), n) + " ms | LinkedList: " + medirFim(new LinkedList<>(), n) + " ms");
        System.out.println("Escolha: LinkedList é boa para inserir/remover nas extremidades (como fila/deque);");
        System.out.println("ArrayList é a melhor opção padrão (acesso por índice O(1) e melhor uso de memória).");
    }
}
