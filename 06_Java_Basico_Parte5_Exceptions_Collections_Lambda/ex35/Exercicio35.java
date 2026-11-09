package ex35;

import java.util.*;
public class Exercicio35 {
    public static void main(String[] args) {
        String[][] dados = {{"Ana", "T1"}, {"Bruno", "T2"}, {"Carla", "T1"}, {"Diego", "T2"}, {"Elisa", "T3"}};
        Map<String, List<String>> porTurma = new TreeMap<>();
        for (String[] d : dados) porTurma.computeIfAbsent(d[1], k -> new ArrayList<>()).add(d[0]);
        System.out.println(porTurma);
    }
}
