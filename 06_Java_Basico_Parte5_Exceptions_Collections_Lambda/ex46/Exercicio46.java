package ex46;

import java.util.*;
public class Exercicio46 {
    record Estatisticas(double min, double max, double media, double soma) {}
    static Estatisticas calcular(List<? extends Number> numeros) {
        if (numeros.isEmpty()) throw new IllegalArgumentException("Lista vazia");
        DoubleSummaryStatistics s = numeros.stream().mapToDouble(Number::doubleValue).summaryStatistics();
        return new Estatisticas(s.getMin(), s.getMax(), s.getAverage(), s.getSum());
    }
    public static void main(String[] args) {
        System.out.println(calcular(List.of(4, 8, 15, 16, 23, 42)));
        System.out.println(calcular(List.of(1.5, 2.5, 3.0)));
    }
}
