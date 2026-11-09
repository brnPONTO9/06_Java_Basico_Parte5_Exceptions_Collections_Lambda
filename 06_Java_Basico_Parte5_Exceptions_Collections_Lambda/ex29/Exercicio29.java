package ex29;

public class Exercicio29 {
    static <T> T ultimo(T[] valores) {
        if (valores == null || valores.length == 0) throw new IllegalArgumentException("Array vazio");
        return valores[valores.length - 1];
    }
    public static void main(String[] args) {
        System.out.println(ultimo(new String[]{"a", "b", "c"}));
        System.out.println(ultimo(new Integer[]{1, 2, 3}));
    }
}
