package Calculator;

public class Calculator {
    int firstNum;
    int secondNum;

    public Calculator(int firstNum, int secondNum) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
    }
    public int plus() {
        return this.firstNum + this.secondNum;
    }
    public int divide() {
        return this.firstNum / this.secondNum;
    }
    public int minus() {
        return this.firstNum - this.secondNum;
    }
    public int multiply() {
        return this.firstNum * this.secondNum;
    }
    public int modulus() {
        return this.firstNum % this.secondNum;
    }
}
