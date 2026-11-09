package ex11;

public class Exercicio11 {
    static void validarIdade(int idade) {
        if (idade < 0) throw new IllegalArgumentException("Idade não pode ser negativa: " + idade);
    }
    public static void main(String[] args) {
        validarIdade(20);
        System.out.println("20 é válida");
        try { validarIdade(-1); } catch (IllegalArgumentException e) { System.out.println("Erro: " + e.getMessage()); }
    }
}
