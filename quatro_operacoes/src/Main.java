//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Criar uma instância da classe biblioteca
        Operacoes operacoes = new Operacoes(24, 2);

        // Soma
        System.out.println("A soma dos números é: " +  operacoes.soma());

        System.out.println("\nA subtração dos números é: " + operacoes.subtracao());

        System.out.println("\nA Divisão dos números é: " + operacoes.divisao());

        System.out.println("\nA multiplicação dos números é: " + operacoes.multiplicacao());
    }
}