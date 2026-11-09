package ex22;

import java.io.IOException;
import java.nio.file.*;
public class Exercicio22 {
    static String ler(String caminho) throws IOException { return Files.readString(Path.of(caminho)); }
    public static void main(String[] args) {
        try {
            System.out.println(ler("arquivo-inexistente.txt"));
        } catch (IOException e) {
            System.out.println("Não foi possível ler o arquivo: " + e.getClass().getSimpleName());
        }
    }
}
