package ex02;

public class Exercicio02 {
    public static void main(String[] args) {
        for (String s : new String[]{"123", "abc"}) {
            try {
                int n = Integer.parseInt(s);
                System.out.println("Convertido: " + n);
            } catch (NumberFormatException e) {
                System.out.println("'" + s + "' não é um inteiro válido");
            }
        }
    }
}
