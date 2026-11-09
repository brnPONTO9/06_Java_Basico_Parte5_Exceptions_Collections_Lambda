package ex44;

import java.util.*;
public class Exercicio44 {
    static class Multimap<K, V> {
        private final Map<K, List<V>> mapa = new LinkedHashMap<>();
        void put(K k, V v) { mapa.computeIfAbsent(k, x -> new ArrayList<>()).add(v); }
        List<V> get(K k) { return mapa.getOrDefault(k, List.of()); }
        @Override public String toString() { return mapa.toString(); }
    }
    public static void main(String[] args) {
        Multimap<String, String> mm = new Multimap<>();
        mm.put("frutas", "maçã");
        mm.put("frutas", "uva");
        mm.put("legumes", "cenoura");
        System.out.println(mm);
        System.out.println(mm.get("frutas") + " " + mm.get("doces"));
    }
}
