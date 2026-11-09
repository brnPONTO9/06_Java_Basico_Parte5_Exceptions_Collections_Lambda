package ex41;

import java.util.*;
public class Exercicio41 {
    record Resultado(List<String> validos, List<String> erros) {}
    // Regra: erro de uma linha (dado ruim) é COLETADO e o processamento continua;
    // erro de infraestrutura/entrada nula (a lista inteira inválida) é LANÇADO, pois não há como continuar.
    static Resultado importar(List<String> linhas) {
        if (linhas == null) throw new IllegalArgumentException("Arquivo inexistente");
        List<String> ok = new ArrayList<>(), erros = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            String[] campos = linhas.get(i).split(";");
            try {
                if (campos.length != 2) throw new IllegalArgumentException("esperado 2 campos");
                int qtd = Integer.parseInt(campos[1].trim());
                if (qtd < 0) throw new IllegalArgumentException("quantidade negativa");
                ok.add(campos[0].trim() + "=" + qtd);
            } catch (IllegalArgumentException e) { // NumberFormatException também é IllegalArgumentException
                erros.add("Linha " + (i + 1) + ": " + e.getMessage());
            }
        }
        return new Resultado(ok, erros);
    }
    public static void main(String[] args) {
        Resultado r = importar(List.of("mouse;10", "teclado;abc", "monitor", "webcam;-2", "cabo;7"));
        System.out.println("Válidos: " + r.validos());
        System.out.println("Erros: " + r.erros());
    }
}
