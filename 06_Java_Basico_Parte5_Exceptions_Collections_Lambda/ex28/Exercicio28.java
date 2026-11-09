package ex28;

import java.util.*;
public class Exercicio28 {
    record Aluno(String nome, double nota) {}
    public static void main(String[] args) {
        List<Aluno> alunos = new ArrayList<>(List.of(new Aluno("Carla", 7.5), new Aluno("Ana", 9.0), new Aluno("Bruno", 6.0)));
        Comparator<Aluno> porNome = Comparator.comparing(Aluno::nome);
        Comparator<Aluno> porNota = Comparator.comparingDouble(Aluno::nota);
        alunos.sort(porNome);
        System.out.println("Por nome: " + alunos);
        alunos.sort(porNota);
        System.out.println("Por nota: " + alunos);
    }
}
