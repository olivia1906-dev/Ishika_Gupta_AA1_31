import java.util.Scanner;

public class PowerOfTwoCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        boolean result = num > 0 && (num & (num - 1)) == 0;
        System.out.println(result);
    }
}
