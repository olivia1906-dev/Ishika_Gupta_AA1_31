import java.util.Scanner;

public class QuotientWithoutDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        int quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
    }
}
