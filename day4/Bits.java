package day3;

import java.util.Scanner;

public class Bits {
    public static void main(String[] args) {
        //Scanner scan = new Scanner(System.in);
       // int data1=0,data2=0;
        //System.out.println("Enter the dat1 and data2");
      //  data1 = scan.nextInt();
        //data2 = scan.nextInt();
        //int diff = data1-data2;
        //int buffer=(diff>>31)&1;
       // System.out.println("Max "+(data1-diff*buffer));
       // System.out.println("Min "+(data2+diff*buffer));
       Scanner scan = new Scanner(System.in);
       int n=0;
       n = scan.nextInt();
       if(n>0&&(n&(n-1))==0&&(n-1)%3==0)
        System.out.println("true");
    else
        System.out.println("False");
        scan.close();
    }
}
