package ex42;

public class Exercicio42 {
    static class ProdutoNaoEncontradoException extends RuntimeException {
        ProdutoNaoEncontradoException(int id) { super("Produto " + id + " não existe"); }
    }
    static class SemEstoqueException extends RuntimeException {
        SemEstoqueException(String nome) { super("Sem estoque: " + nome); }
    }
    static class Loja {
        void comprar(int id, int qtd) {
            if (id != 1) throw new ProdutoNaoEncontradoException(id);
            if (qtd > 5) throw new SemEstoqueException("Mouse");
            System.out.println("Compra de " + qtd + " mouse(s) realizada");
        }
    }
    public static void main(String[] args) {
        Loja loja = new Loja();
        int[][] tentativas = {{1, 2}, {7, 1}, {1, 50}};
        for (int[] t : tentativas) {
            try { loja.comprar(t[0], t[1]); }
            catch (ProdutoNaoEncontradoException e) { System.out.println("Ops! Não achamos esse produto no catálogo."); }
            catch (SemEstoqueException e) { System.out.println("Ops! Acabou o estoque desse item. Tente uma quantidade menor."); }
        }
    }
}
