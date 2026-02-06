import java.util.Scanner;

public class MenuDrivenCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Modulus");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1: System.out.println("Result: " + (a + b)); break;
            case 2: System.out.println("Result: " + (a - b)); break;
            case 3: System.out.println("Result: " + (a * b)); break;
            case 4: System.out.println("Result: " + (a / b)); break;
            case 5: System.out.println("Result: " + (a % b)); break;
            default: System.out.println("Invalid choice");
        }
    }
}
