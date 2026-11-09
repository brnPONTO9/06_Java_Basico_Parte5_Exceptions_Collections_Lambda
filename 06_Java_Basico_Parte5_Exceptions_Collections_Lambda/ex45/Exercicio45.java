package ex45;

import java.util.*;
public class Exercicio45 {
    public static void main(String[] args) {
        String[] docs = {"java é legal", "python é legal", "java e spring"};
        Map<String, Set<Integer>> indice = new TreeMap<>();
        for (int id = 0; id < docs.length; id++)
            for (String palavra : docs[id].split(" "))
                indice.computeIfAbsent(palavra, k -> new TreeSet<>()).add(id);
        System.out.println(indice);
        System.out.println("'java' aparece nos documentos: " + indice.get("java"));
    }
}
