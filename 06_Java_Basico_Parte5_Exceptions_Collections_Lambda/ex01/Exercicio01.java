package ex01;

public class Exercicio01 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            System.out.println(a / b); // lança ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Erro tratado: " + e.getMessage());
        }
    }
}
