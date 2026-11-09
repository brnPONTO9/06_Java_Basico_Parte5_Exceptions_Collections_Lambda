package ex37;

import java.util.*;
public class Exercicio37 {
    // PECS: Producer Extends, Consumer Super.
    // List<? super Integer> aceita ESCREVER Integer (é consumidora); ao ler, só se garante Object.
    static void preencher(List<? super Integer> destino) {
        for (int i = 1; i <= 3; i++) destino.add(i);
    }
    public static void main(String[] args) {
        List<Number> numeros = new ArrayList<>();
        numeros.add(2.5);
        preencher(numeros);
        System.out.println(numeros);
        List<Object> objetos = new ArrayList<>();
        preencher(objetos); // também funciona: Object é supertipo de Integer
        System.out.println(objetos);
    }
}
