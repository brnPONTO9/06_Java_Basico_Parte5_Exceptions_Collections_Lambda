package ex03;

import java.util.ArrayList;
import java.util.List;
public class Exercicio03 {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>(List.of("Ana", "Bruno", "Carla"));
        System.out.println("Tamanho: " + nomes.size());
        System.out.println("Índice 1: " + nomes.get(1));
    }
}
