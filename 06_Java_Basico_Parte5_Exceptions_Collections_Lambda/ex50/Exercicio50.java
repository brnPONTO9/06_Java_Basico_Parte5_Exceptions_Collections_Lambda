package ex50;

import java.util.*;
import java.util.stream.Collectors;
/*
 * Refatoração do projeto integrador (pedidos).
 *
 * 1) Loop que DEVE continuar imperativo: a leitura/validação linha a linha que COLETA erros e continua.
 *    Motivo: precisa de controle de fluxo com try/catch por iteração, índice da linha (para a mensagem)
 *    e acumula em duas listas (sucessos e erros). Em Stream, lambdas não podem lançar checked exceptions
 *    e o código ficaria mais confuso (e efeitos colaterais dentro do pipeline são má prática).
 *
 * 2) Processamento que fica MELHOR com Stream: relatório de faturamento por cliente (filtrar -> agrupar -> somar -> ordenar).
 *    Motivo: é uma transformação declarativa de dados sem efeitos colaterais, e groupingBy/summingDouble
 *    expressam a intenção diretamente, com menos código mutável que o equivalente com for e Map.
 */
public class Exercicio50 {
    record Pedido(String cliente, double valor) {}

    // imperativo: coleta de erros por linha
    static List<Pedido> lerPedidos(List<String> linhas, List<String> erros) {
        List<Pedido> ok = new ArrayList<>();
        for (int i = 0; i < linhas.size(); i++) {
            try {
                String[] c = linhas.get(i).split(";");
                ok.add(new Pedido(c[0], Double.parseDouble(c[1])));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
                erros.add("linha " + (i + 1) + ": " + e.getClass().getSimpleName());
            }
        }
        return ok;
    }

    // stream: faturamento por cliente, do maior para o menor
    static Map<String, Double> faturamento(List<Pedido> pedidos) {
        return pedidos.stream()
                .filter(p -> p.valor() > 0)
                .collect(Collectors.groupingBy(Pedido::cliente, Collectors.summingDouble(Pedido::valor)))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        List<String> erros = new ArrayList<>();
        List<Pedido> pedidos = lerPedidos(List.of("Ana;100", "Bruno;abc", "Ana;50.5", "Carla", "Bruno;200"), erros);
        System.out.println("Erros: " + erros);
        System.out.println("Faturamento: " + faturamento(pedidos));
    }
}
