package ex10;

public class Exercicio10 {
    @FunctionalInterface
    interface Saudacao { void saudar(String nome); }
    public static void main(String[] args) {
        Saudacao s = nome -> System.out.println("Olá, " + nome + "! Seja bem-vindo(a).");
        s.saudar("Ana");
    }
}
