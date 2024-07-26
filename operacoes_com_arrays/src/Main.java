public class Main {
    public static void main(String[] args) {
        int[] numeros = {24, 5, 7, 9};
        // Estrutura de variáveis com array

        OperacoesArray operacoes = new OperacoesArray(numeros);

        // Soma
        System.out.println("A soma dos arrays é: " + operacoes.soma());

        // Subtração
        System.out.println("\nA subtração dos arrays é: " + operacoes.subtracao());

        // Multiplicação
        System.out.println("\nA multiplicação dos arrays é: " + operacoes.multiplicacao());

        // Divisão
        System.out.println("\nA divisão dos arrays é: " + operacoes.divisao());

        // Média
        System.out.println("\nA média é: " + operacoes.media());
    }
}
