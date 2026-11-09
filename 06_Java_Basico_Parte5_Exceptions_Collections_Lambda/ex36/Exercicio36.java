package ex36;

import java.util.*;
public class Exercicio36 {
    static class Repositorio<T, ID> {
        private final Map<ID, T> dados = new HashMap<>();
        void salvar(ID id, T item) { dados.put(id, item); }
        Optional<T> buscarPorId(ID id) { return Optional.ofNullable(dados.get(id)); }
    }
    public static void main(String[] args) {
        Repositorio<String, Integer> r = new Repositorio<>();
        r.salvar(1, "Ana");
        System.out.println(r.buscarPorId(1).orElse("?"));
        System.out.println(r.buscarPorId(2).orElse("não encontrado"));
    }
}
