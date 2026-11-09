package ex43;

import java.util.*;
import java.util.function.Function;
public class Exercicio43 {
    static class Cache<K, V> {
        private final Map<K, V> mapa = new HashMap<>();
        V getOrCompute(K chave, Function<K, V> funcao) {
            V v = mapa.get(chave);
            if (v == null) { v = funcao.apply(chave); mapa.put(chave, v); }
            return v;
        }
    }
    public static void main(String[] args) {
        Cache<Integer, Long> cache = new Cache<>();
        Function<Integer, Long> custosa = n -> { System.out.println("calculando fatorial de " + n + "..."); long r = 1; for (int i = 2; i <= n; i++) r *= i; return r; };
        System.out.println(cache.getOrCompute(10, custosa));
        System.out.println(cache.getOrCompute(10, custosa)); // vem do cache, não recalcula
    }
}
