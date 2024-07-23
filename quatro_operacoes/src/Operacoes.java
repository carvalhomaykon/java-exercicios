public class Operacoes {
    int number1;
    int number2;

    public Operacoes (int number1, int number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public int soma(){
        return number1 + number2;
    }

    public int subtracao(){
        return number1 - number2;
    }

    public int divisao(){
        return number1 / number2;
    }

    public int multiplicacao(){
        return number1 * number2;
    }
}
