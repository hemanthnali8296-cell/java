package day1;
import java.util.Scanner;

public class sumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = a+b;
        System.out.println(c +" the sum is");
        scan.close();
    }
}
