package ex49;

import java.util.*;
/*
 * Projeto integrador: processador de pedidos a partir de linhas de texto "cliente;produto;quantidade".
 * Cinco testes manuais de falha comprovam o tratamento de exceptions.
 */
public class Exercicio49 {
    static class PedidoInvalidoException extends Exception {
        PedidoInvalidoException(String msg, Throwable causa) { super(msg, causa); }
        PedidoInvalidoException(String msg) { super(msg); }
    }
    static class EstoqueInsuficienteException extends RuntimeException {
        EstoqueInsuficienteException(String msg) { super(msg); }
    }
    record Pedido(String cliente, String produto, int quantidade) {}
    static final Map<String, Integer> estoque = new HashMap<>(Map.of("mouse", 5, "teclado", 2));

    static Pedido ler(String linha) throws PedidoInvalidoException {
        if (linha == null || linha.isBlank()) throw new PedidoInvalidoException("Linha vazia");
        String[] c = linha.split(";");
        if (c.length != 3) throw new PedidoInvalidoException("Esperado 3 campos: " + linha);
        try { return new Pedido(c[0].trim(), c[1].trim().toLowerCase(), Integer.parseInt(c[2].trim())); }
        catch (NumberFormatException e) { throw new PedidoInvalidoException("Quantidade inválida em: " + linha, e); }
    }
    static void processar(Pedido p) {
        Integer disp = estoque.get(p.produto());
        if (disp == null) throw new NoSuchElementException("Produto inexistente: " + p.produto());
        if (p.quantidade() <= 0) throw new IllegalArgumentException("Quantidade deve ser positiva");
        if (p.quantidade() > disp) throw new EstoqueInsuficienteException("Estoque de " + p.produto() + ": " + disp + ", pedido: " + p.quantidade());
        estoque.put(p.produto(), disp - p.quantidade());
    }
    public static void main(String[] args) {
        String[] testes = {
            "Ana;mouse;2",       // sucesso
            "Bruno;mouse;abc",   // falha 1: NumberFormatException -> PedidoInvalidoException (com cause)
            "Carla;teclado",     // falha 2: número de campos errado
            "Diego;webcam;1",    // falha 3: produto inexistente
            "Elisa;teclado;10",  // falha 4: estoque insuficiente
            "Fabio;mouse;-1",    // falha 5: quantidade não positiva
        };
        for (String t : testes) {
            try {
                processar(ler(t));
                System.out.println("OK    -> " + t);
            } catch (PedidoInvalidoException e) {
                System.out.println("ERRO  -> " + e.getMessage() + (e.getCause() != null ? " [causa: " + e.getCause().getClass().getSimpleName() + "]" : ""));
            } catch (NoSuchElementException | EstoqueInsuficienteException | IllegalArgumentException e) {
                System.out.println("ERRO  -> " + e.getClass().getSimpleName() + ": " + e.getMessage());
            }
        }
        System.out.println("Estoque final: " + new TreeMap<>(estoque));
    }
}
