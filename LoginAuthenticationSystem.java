import java.util.Scanner;

public class LoginAuthenticationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctUser = "admin";
        String correctPass = "1234";

        int attempts = 0;

        while (attempts < 3) {
            System.out.print("Enter username: ");
            String user = sc.next();

            System.out.print("Enter password: ");
            String pass = sc.next();

            if (user.equals(correctUser) && pass.equals(correctPass)) {
                System.out.println("Login Successful!");
                return;
            } else {
                attempts++;
                System.out.println("Wrong credentials. Attempts left: " + (3 - attempts));
            }
        }

        System.out.println("Account locked due to 3 failed attempts.");
    }
}
