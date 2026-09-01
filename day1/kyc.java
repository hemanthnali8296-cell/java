package day1;

import java.util.Scanner;

public class kyc {
    public static void main(String[] args) {

        Scanner shanmugha = new Scanner(System.in);
        String name="",pan ="",address ="";long aadhaar=0L,mobile=0L;
        System.out.println("Welcome to Shanmugha Bank");
        System.out.println("Let me know your name");
        name = shanmugha.nextLine();
        System.out.println("Let me know the address");
        address = shanmugha.nextLine();
        System.out.println("Enter the Pan");
        pan = shanmugha.next();
        System.out.println("Enter Mobile");
        mobile = shanmugha.nextLong();
        System.out.println("Enter the aadhaar");
        aadhaar = shanmugha.nextLong();
        System.out.println("KYC Has submitted by "+name+" futher updates you get "+mobile);
        System.out.println(pan);
        System.out.println(address);System.out.println(aadhaar);
        shanmugha.close();
    }
}
