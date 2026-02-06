import java.util.Scanner;

public class MultiplyBySeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = (num << 3) - num; // (num * 8) - num = num * 7

        System.out.println("Result: " + result);
    }
}
