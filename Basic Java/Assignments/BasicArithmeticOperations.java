import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        
        // Addition
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
        
        // Subtraction
        int difference = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + difference);
        
        // Multiplication
        int product = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + product);
        
        // Division
        double quotient = (double) num1 / num2;
        System.out.println(num1 + " / " + num2 + " = " + quotient);
        
        // Remainder
        int remainder = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + remainder);
    }
}
