package ex04;

import java.util.ArrayList;
import java.util.List;
public class Exercicio04 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Ana"); // List aceita duplicados
        System.out.println(nomes + " tamanho " + nomes.size());
    }
}
