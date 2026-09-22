package day3;

import java.util.Scanner;

public class debitcount {
    public static void main(String[] args) {
        int balence =0, prev=Integer.MIN_VALUE,debit=0;
        Scanner scan =new Scanner(System.in);
        for(int time=41;time<=50;time+=2){
            System.out.println("Current Balence: ");
            balence = scan.nextInt();
            if(prev>balence) debit++;
            prev = balence;
        }
        debit-=3;
        balence = (debit>0)?balence-=(debit*25):balence;
        System.out.println(balence);
        scan.close();
    }
}
