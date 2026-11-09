package ex07;

import java.util.LinkedList;
import java.util.Queue;
public class Exercicio07 {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();
        fila.add("Chamado 1");
        fila.add("Chamado 2");
        fila.add("Chamado 3");
        System.out.println("Atendendo: " + fila.poll());
        System.out.println("Restantes: " + fila);
    }
}
