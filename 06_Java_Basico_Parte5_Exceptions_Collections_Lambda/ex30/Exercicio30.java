package ex30;

import java.util.List;
public class Exercicio30 {
    static double somar(List<? extends Number> numeros) {
        double soma = 0;
        for (Number n : numeros) soma += n.doubleValue();
        return soma;
    }
    public static void main(String[] args) {
        System.out.println(somar(List.of(1, 2, 3)));
        System.out.println(somar(List.of(1.5, 2.5)));
        System.out.println(somar(List.of(1, 2.5, 3L)));
    }
}
