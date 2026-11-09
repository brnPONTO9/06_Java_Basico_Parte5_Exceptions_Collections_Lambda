package ex27;

import java.util.*;
public class Exercicio27 {
    static class Aluno implements Comparable<Aluno> {
        final int matricula; final String nome;
        Aluno(int m, String n) { matricula = m; nome = n; }
        @Override public int compareTo(Aluno o) { return Integer.compare(matricula, o.matricula); }
        @Override public String toString() { return matricula + "-" + nome; }
    }
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(List.of(new Aluno(30, "Carla"), new Aluno(10, "Ana"), new Aluno(20, "Bruno")));
        Collections.sort(alunos);
        System.out.println(alunos);
    }
}
