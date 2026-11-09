package ex23;

public class Exercicio23 {
    static class Recurso implements AutoCloseable {
        final String nome;
        Recurso(String nome) { this.nome = nome; System.out.println("Abrindo " + nome); }
        void usar() { System.out.println("Usando " + nome); }
        @Override public void close() { System.out.println("close() chamado em " + nome); }
    }
    public static void main(String[] args) {
        try (Recurso r = new Recurso("Conexão")) {
            r.usar();
        }
        try (Recurso r = new Recurso("Arquivo")) {
            r.usar();
            throw new IllegalStateException("falha no meio do uso");
        } catch (IllegalStateException e) {
            System.out.println("Capturado: " + e.getMessage() + " (o close já foi chamado antes do catch)");
        }
    }
}
