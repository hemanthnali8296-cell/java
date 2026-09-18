package day2;

import java.util.Scanner;

public class param {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weight  = 0 , height = 0 ,bmi = 0;
        String status ="";
        System.out.println("Welcome to Know you health status");
        System.out.println("Let us know your weight(kg) ");
        weight = scan.nextDouble();
        System.out.println("Let us know your height");
        height = scan.nextDouble();
        height/=100;
        bmi=weight/(height*height);
        status = (bmi<18.0)?"UnderWeight":
        (bmi>=18.0&&bmi<=24.0)?"Normal":
        (bmi>24.0&&bmi<28.0)?"Overweight":"Obese";
        System.out.println(status+" is your health update");
        scan.close();
    }
}
