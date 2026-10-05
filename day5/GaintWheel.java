package day4;

import java.util.Scanner;

public class GaintWheel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int cabin=91;cabin>=87;cabin--){
            System.out.println("New Cabin Arrived");
            for(int person=1;person<=4;){
                System.out.println("Let me Know Your Age ");
                int age = scan.nextInt();
                if(age>=18&&age<=60){
                    person++;
                    System.out.println("Enjoy the ride");
                }else System.out.println("Safety is prior your ride");
            }
        }
        scan.close();
    }
}
