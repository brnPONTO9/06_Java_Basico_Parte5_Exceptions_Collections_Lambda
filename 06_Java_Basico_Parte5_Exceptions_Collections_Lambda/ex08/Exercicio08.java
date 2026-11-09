package ex08;

import java.util.Iterator;
import java.util.List;
public class Exercicio08 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(10, 20, 30);
        Iterator<Integer> it = nums.iterator();
        while (it.hasNext()) System.out.println(it.next());
    }
}
