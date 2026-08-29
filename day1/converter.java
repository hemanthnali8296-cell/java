 package day1;
  import java.util.Scanner;

public class converter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Indian Rupees: ");
        double inr = sc.nextDouble();

        double usd = inr * 0.012;  
        double gbp = inr * 0.0086; 
        double aed = inr * 0.044;   
        double cny = inr * 0.086;   

        System.out.println("Currency Conversion");
        System.out.println("US Dollar (USD): " + usd);
        System.out.println("British Pound (GBP): " + gbp);
        System.out.println("UAE Dirham (AED): " + aed);
        System.out.println("Chinese Yuan (CNY): " + cny);
        sc.close();
    }
} 
    

