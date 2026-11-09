package ex13;

public class Exercicio13 {
    public static void main(String[] args) {
        String[] entradas = {"abc", "5", "9"};
        int[] vetor = new int[3];
        for (String e : entradas) {
            try {
                int posicao = Integer.parseInt(e);
                System.out.println(vetor[posicao]);
            } catch (NumberFormatException ex) {
                System.out.println("'" + e + "' não é número");
            } catch (ArrayIndexOutOfBoundsException ex) {
                System.out.println("Posição " + e + " fora do vetor");
            }
        }
    }
}
