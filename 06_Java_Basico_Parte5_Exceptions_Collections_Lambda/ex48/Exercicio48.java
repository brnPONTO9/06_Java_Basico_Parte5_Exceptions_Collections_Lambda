package ex48;

import java.util.*;
import java.util.stream.Collectors;
public class Exercicio48 {
    record Venda(String vendedor, double valor) {}
    public static void main(String[] args) {
        List<Venda> vendas = List.of(new Venda("Ana", 100), new Venda("Bruno", 250), new Venda("Ana", 300), new Venda("Carla", 50), new Venda("Bruno", 100));
        Map<String, Double> fat = vendas.stream().collect(Collectors.groupingBy(Venda::vendedor, Collectors.summingDouble(Venda::valor)));
        fat.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(e -> System.out.printf("%s: R$ %.2f%n", e.getKey(), e.getValue()));
    }
}
