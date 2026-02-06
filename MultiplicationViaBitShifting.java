import java.util.Scanner;

public class MultiplicationViaBitShifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        while (b != 0) {
            if ((b & 1) != 0)
                result += a;
            a <<= 1;
            b >>= 1;
        }

        System.out.println("Product: " + result);
    }
}
import java.util.Scanner;

public class MultiplicationViaBitShifting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        while (b != 0) {
            if ((b & 1) != 0)
                result += a;
            a <<= 1;
            b >>= 1;
        }

        System.out.println("Product: " + result);
    }
}
