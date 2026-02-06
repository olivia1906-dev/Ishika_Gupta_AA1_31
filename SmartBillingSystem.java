import java.util.Scanner;

public class SmartBillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double totalBill = price * quantity;
        double discount = 0;

        // Applying discount using nested if-else
        if (totalBill >= 5000) 
        {
            discount = totalBill * 0.10; // 10% discount
        }
        else if (totalBill >= 2000)
        {
            discount = totalBill * 0.05; // 5% discount
        }

        double discountedAmount = totalBill - discount;
        double gst = discountedAmount * 0.18; // 18% GST
        double finalAmount = discountedAmount + gst;

        System.out.println("Total Bill: " + totalBill);
        System.out.println("Discount: " + discount);
        System.out.println("GST: " + gst);
        System.out.println("Final Payable Amount: " + finalAmount);
    }
}
