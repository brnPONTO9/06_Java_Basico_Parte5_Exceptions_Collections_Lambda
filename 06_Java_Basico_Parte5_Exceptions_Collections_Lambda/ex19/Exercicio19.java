package ex19;

public class Exercicio19 {
    static class Caixa<T> {
        private T conteudo;
        Caixa(T conteudo) { this.conteudo = conteudo; }
        T get() { return conteudo; }
        void set(T c) { conteudo = c; }
    }
    public static void main(String[] args) {
        Caixa<String> cs = new Caixa<>("texto");
        Caixa<Integer> ci = new Caixa<>(42);
        String s = cs.get();   // sem cast
        int i = ci.get();
        System.out.println(s + " " + i);
    }
}
