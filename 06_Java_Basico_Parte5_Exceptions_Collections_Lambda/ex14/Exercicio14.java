package ex14;

import java.util.*;
public class Exercicio14 {
    public static void main(String[] args) {
        List<Integer> ids = List.of(3, 1, 3, 2, 1, 5);
        Set<Integer> unicos = new LinkedHashSet<>(ids); // mantém a ordem de chegada
        System.out.println(ids + " -> " + unicos);
    }
}
