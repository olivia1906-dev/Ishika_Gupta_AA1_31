import java.util.Scanner;

public class SetBitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int count = 0;

        while (num != 0) {
            count += num & 1;
            num >>= 1;
        }

        System.out.println("Set bits: " + count);
    }
}
