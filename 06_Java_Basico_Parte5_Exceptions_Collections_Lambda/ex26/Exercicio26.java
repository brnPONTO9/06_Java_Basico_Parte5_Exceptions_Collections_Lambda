package ex26;

import java.util.ArrayDeque;
import java.util.Deque;
public class Exercicio26 {
    public static void main(String[] args) {
        Deque<String> historico = new ArrayDeque<>();
        historico.push("digitou 'Olá'");
        historico.push("apagou 'á'");
        historico.push("digitou 'a'");
        System.out.println("Desfazendo: " + historico.pop()); // último a entrar, primeiro a sair (LIFO)
        System.out.println("Desfazendo: " + historico.pop());
        System.out.println("Restante: " + historico);
    }
}
