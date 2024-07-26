package operacoes_com_arrays.src;

public class OperacoesArray {
    private int[] numbers;

    // Construtor para inicializar o array de números
    public OperacoesArray(int[] numbers) {
        this.numbers = numbers;
    }

    // Método para somar todos os elementos do array
    public int soma() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // Método para subtrair todos os elementos do array
    public int subtracao() {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            result -= numbers[i];
        }
        return result;
    }

    // Método para multiplicar todos os elementos do array
    public int multiplicacao() {
        int product = 1;
        for (int number : numbers) {
            product *= number;
        }
        return product;
    }

    // Método para dividir todos os elementos do array
    public double divisao() {
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                result /= numbers[i];
            } else {
                System.out.println("Erro: Divisão por zero.");
                return 0;
            }
        }
        return result;
    }

    // Método para calcular a média dos elementos do array
    public double media() {
        return (double) soma() / numbers.length;
    }
}
