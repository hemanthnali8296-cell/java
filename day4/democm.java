package day3;

public class democm{
    public static void main(String[] sscet) {
        if(sscet.length==0)return;
        float amount = Float.parseFloat(sscet[0]);
        if(amount>1000&&amount<=5000)
            System.out.println(amount+" Transffered With 5Rs");
        else if(amount>5000&&amount<=10000)
            System.out.println(amount+" Transffered With 10Rs");
        else if(amount>10000&&amount<=50000)
            System.out.println(amount+" Transffered With 30Rs");
        else if(amount>=50000)
            System.out.println(amount+" Transffered With 100Rs");
        else
            System.out.println(amount+" Transffered With No Charges");

    }
}