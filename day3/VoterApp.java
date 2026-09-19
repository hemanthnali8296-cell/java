package day2;

import java.util.Scanner;


public class VoterApp {
    public static void main(String[] args) {
        String name="", pan = "", email = "", aadhaar="",mobile="";
        boolean isValid = true;
        Scanner hii = new Scanner(System.in);
        System.out.println("Enter the Name");
        name= hii.nextLine();
        System.out.println("enter the email");
        email=hii.next();
        System.out.println("Enter the Mobile Number");
        mobile= hii.next();
        System.out.println("enter the aadhaar");
        aadhaar= hii.next();
        System.out.println("enter the PAN");
        pan=hii.next();
        if(!name.matches("[A-Za-z ]{5,}$"))
        {isValid=false;System.out.println("Invalid Name");}
        if(!email.matches("^[A-Za-z0-9_.-]{2,}@[A-Za-z]{3,}+\\.[a-z]{2,}$"))
        {isValid=false;System.out.println("Invalid Email");}
        if(!mobile.matches("^[0-9]{10}$"))
        {isValid=false;System.out.println("Invalid Mobile");}
        if(!aadhaar.matches("^[0-9]{12}$"))
        {isValid=false;System.out.println("Invalid Aadhaar");}
        if(!pan.matches("^[A-Z]{5}[0-9]{4}[A-Z]{1}$"))
        {isValid=false;}System.out.println("Invalid Pan");
        if(isValid)
            System.out.println(name+"Voter Appilcation Submited furthur updates send to "+mobile+"or"+email);
        else System.out.println("Appilcation Rejected");
        hii.close();
    }   
}
