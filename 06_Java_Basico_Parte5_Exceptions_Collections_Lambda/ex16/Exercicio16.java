package ex16;

import java.util.*;
public class Exercicio16 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8));
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) if (it.next() % 2 == 0) it.remove(); // remoção segura durante o percurso
        System.out.println(nums);
    }
}
