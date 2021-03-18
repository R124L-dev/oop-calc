  
package Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        runCalculator();
    }
    public static void runCalculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan angka pertama : ");
        int firstNum = scanner.nextInt();
        System.out.print("Masukan angka kedua : ");
        int secondNum = scanner.nextInt();

        Calculator calculator = new Calculator(firstNum, secondNum);
        System.out.println(firstNum + " + " + secondNum + " = " + calculator.plus());
        System.out.println(firstNum + " / " + secondNum + " = " + calculator.divide());
        System.out.println(firstNum + " - " + secondNum + " = " + calculator.minus());
        System.out.println(firstNum + " x " + secondNum + " = " + calculator.multiply());
        System.out.println(firstNum + " % " + secondNum + " = " + calculator.modulus());
    }
}