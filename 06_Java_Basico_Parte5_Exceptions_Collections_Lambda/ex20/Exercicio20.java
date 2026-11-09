package ex20;

import java.util.function.Predicate;
public class Exercicio20 {
    public static void main(String[] args) {
        Predicate<Integer> positivo = n -> n > 0;
        System.out.println(positivo.test(5));
        System.out.println(positivo.test(-3));
        System.out.println(positivo.test(0));
    }
}
