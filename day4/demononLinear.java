package day3;

import java.util.Scanner;

public class demononLinear {
   public static void main(String[] args) {
    int mBalence = 20000,count=0;
    Scanner scan=new Scanner(System.in);
    int required = 0;
    while (mBalence>=500) {
        System.out.println("Reqiured amount");
        required = scan.nextInt();
        if(required<=mBalence){
            if(required%500==0){
                mBalence-=required;
                System.out.println(required+"Dispensed");
                count++;
            }
            else
                System.out.println("Insuficient Balence in Machine");
       }
       System.out.println(count+ "Withdrawls Made");
       scan.close(); 
    }
   } 
}
