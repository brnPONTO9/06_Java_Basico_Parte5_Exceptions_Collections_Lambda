package ex32;

public class Exercicio32 {
    static class QuantidadeInvalidaException extends Exception {
        QuantidadeInvalidaException(String msg, Throwable causa) { super(msg, causa); } // preserva a causa
    }
    static int converterQuantidade(String texto) throws QuantidadeInvalidaException {
        try {
            return Integer.parseInt(texto);
        } catch (NumberFormatException e) { // exceção técnica -> exceção de domínio
            throw new QuantidadeInvalidaException("Quantidade inválida: '" + texto + "'", e);
        }
    }
    public static void main(String[] args) {
        try { converterQuantidade("dez"); }
        catch (QuantidadeInvalidaException e) {
            System.out.println(e.getMessage());
            System.out.println("Causa original: " + e.getCause());
        }
    }
}
