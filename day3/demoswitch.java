package day2;

import java.util.Scanner;

public class demoswitch {
    public static void main(String[] args) {
        int tenure=0;double cost=0,emi=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("The Amount for EMI Eligible");
        cost= scan.nextDouble();
        if(cost>=5000){
            System.out.println("eligible to convert emi"+cost+"into EMI");
            System.out.println("Enter Desired tenure");
            tenure= scan.nextInt();
            switch (tenure) {
                case 12: case 3: case 6: case 9:
                    emi=(cost+(cost*0.05))/tenure;
                    System.out.println("Your ROI is 5% ");
                    break;
                case 24:
                   emi=(cost+(cost*0.10))/tenure;
                   System.out.println("Your ROI is 10% ");
                   break;
                   case 36:
                   emi=(cost+(cost*0.15))/tenure;
                   System.out.println("Your ROI is 15% ");
                   break;
                default:
                    System.out.println("Invalid Tenure");
                    break;
            }
            System.out.println("Your Repayment EMI" +emi);
        }
        else{
            System.out.println(cost+"is not eligible for EMI");
        }
        scan.close();
    }
    
}
