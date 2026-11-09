package ex21;

public class Exercicio21 {
    static class EstoqueInsuficienteException extends RuntimeException {
        EstoqueInsuficienteException(String msg) { super(msg); }
    }
    static class Estoque {
        private int quantidade;
        Estoque(int q) { this.quantidade = q; }
        void retirar(int q) {
            if (q > quantidade) throw new EstoqueInsuficienteException("Pediu " + q + " mas só há " + quantidade);
            quantidade -= q;
        }
    }
    public static void main(String[] args) {
        Estoque e = new Estoque(10);
        e.retirar(4);
        try { e.retirar(20); } catch (EstoqueInsuficienteException ex) { System.out.println("Erro: " + ex.getMessage()); }
    }
}
