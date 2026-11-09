package ex17;

import java.util.*;
public class Exercicio17 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(5, 2, 9, 1, 7));
        Collections.sort(nums);
        System.out.println("Crescente: " + nums);
        nums.sort(Comparator.reverseOrder());
        System.out.println("Decrescente: " + nums);
    }
}
