import java.util.Scanner;

public class Operations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number:");
        double num1 = scan.nextDouble();
        System.out.println("Input the second number:");
        double num2 = scan.nextDouble();
        System.out.println("Sum: " + Math.round((num1 + num2) * 100) / 100);
        System.out.println("Difference: " + Math.round((num1 - num2) * 100) / 100);
        System.out.println("Product: " + Math.round((num1 * num2) * 100) / 100);
        System.out.println("Quotient: " + (Math.round(num1 / num2 * 100.0) / 100.0));
    }
}
