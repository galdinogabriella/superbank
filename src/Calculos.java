public class Calculos {

    private double num1;
    private double num2;

    /*
     * double n1;
     * double n2;
     * 
     * public double soma(double n1, double n2){
     * return this.n1 + this.n2;
     * }
     */

    public double soma(double n1, double n2) {
        // retorna o resultado
        return n1 + n2;
    }

    public double subtracao(double n1, double n2) {
        // retorna o resultado
        return n1 - n2;
    }

    public double divisao(double n1, double n2) {
        // retorna o resultado
        return n1 / n2;
    }

    public double multiplicacao(double n1, double n2) {
        // retorna o resultado
        return n1 * n2;
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }
}
