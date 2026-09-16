package day2; 
  import java.util.Scanner;

public class delivery {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = "", email = "", mobile = "", address = "", foodItem = "", payment = "";
        double amount, deliveryCharge, finalAmount;
        boolean isValid = true;
        System.out.println("Enter your name:");
        name = scan.nextLine();
        System.out.println("Enter your email:");
        email = scan.next();
        scan.nextLine();
        System.out.println("Enter your address:");
        address = scan.nextLine();
        System.out.println("Enter your mobile number:");
        mobile = scan.next();
        scan.nextLine();
        System.out.println("Enter food item:");
        foodItem = scan.nextLine();
        System.out.println("Enter total order amount:");
        amount = scan.nextDouble();
        scan.nextLine();
        System.out.println("Enter payment method (Cash/UPI/Card):");
        payment = scan.nextLine();
        if (!name.matches("^[A-Za-z ]{5,}$")) {
            isValid = false;
            System.out.println("Invalid Name");
        }
        if (!email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")) {
            isValid = false;
            System.out.println("Invalid Email");
        }
        if (!mobile.matches("^[0-9]{10}$")) {
            isValid = false;
            System.out.println("Invalid Mobile Number");
        }
        if (!address.matches("^[A-Za-z0-9,./# -]{5,}$")) {
            isValid = false;
            System.out.println("Invalid Address");
        }
        if (!foodItem.matches("^[A-Za-z ]{3,}$")) {
            isValid = false;
            System.out.println("Invalid Food Item");
        }

        if (amount <= 0) {
            isValid = false;
            System.out.println("Invalid Order Amount");
        }

        if (!payment.matches("(?i)Cash|UPI|Card")) {
            isValid = false;
            System.out.println("Invalid Payment Method");
        }

        if (isValid) {

            if (amount >= 500) {
                deliveryCharge = 0;
                System.out.println("\nCongratulations! You got FREE Delivery.");
            } else {
                deliveryCharge = 50;
                System.out.println("\nDelivery Charge : ₹50");
            }

            finalAmount = amount + deliveryCharge;

            System.out.println("\n******** FOOD ORDER BILL ********");
            System.out.println("Customer Name  : " + name);
            System.out.println("Food Item      : " + foodItem);
            System.out.println("Delivery Addr  : " + address);
            System.out.println("Mobile Number  : " + mobile);
            System.out.println("Email          : " + email);
            System.out.println("Order Amount   : ₹" + amount);
            System.out.println("Delivery Charge: ₹" + deliveryCharge);
            System.out.println("Payment Method : " + payment);
            System.out.println("--------------------------------");
            System.out.println("Final Amount   : ₹" + finalAmount);
            System.out.println("Order Placed Successfully!");
        } else {
            System.out.println("\nOrder Rejected Due to Invalid Details.");
        }

        scan.close();
    }
}