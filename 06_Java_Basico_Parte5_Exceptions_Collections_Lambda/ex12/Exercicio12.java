package ex12;

public class Exercicio12 {
    public static void main(String[] args) {
        try {
            Integer.parseInt("x1");
        } catch (NumberFormatException e) {
            System.out.println("Conversão falhou");
        } finally {
            System.out.println("finally: executa sempre, com ou sem erro");
        }
    }
}
