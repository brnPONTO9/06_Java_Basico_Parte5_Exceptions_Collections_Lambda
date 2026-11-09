package ex15;

import java.util.*;
public class Exercicio15 {
    public static void main(String[] args) {
        String texto = "java é bom java é legal java";
        Map<String, Integer> freq = new TreeMap<>();
        for (String palavra : texto.split(" ")) freq.merge(palavra, 1, Integer::sum);
        System.out.println(freq);
    }
}
