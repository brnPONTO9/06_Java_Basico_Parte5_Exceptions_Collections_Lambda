package ex31;

public class Exercicio31 {
    static class LimiteCreditoException extends Exception {
        private final double limiteDisponivel;
        LimiteCreditoException(String msg, double limiteDisponivel) { super(msg); this.limiteDisponivel = limiteDisponivel; }
        double getLimiteDisponivel() { return limiteDisponivel; }
    }
    static void comprar(double valor, double limite) throws LimiteCreditoException {
        if (valor > limite) throw new LimiteCreditoException("Compra acima do limite", limite);
    }
    public static void main(String[] args) {
        try { comprar(1500, 1000); }
        catch (LimiteCreditoException e) { System.out.println(e.getMessage() + ". Limite disponível: R$ " + e.getLimiteDisponivel()); }
    }
}
