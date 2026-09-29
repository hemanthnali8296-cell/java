package day3;

public class typeparsing {
    public static void main(String[] args) {
        //Convert from String to Other types
        //Using desired Convertable Wrapper Class's parse method
        String strWt="64.10",strHt="158";
        double weight = Double.parseDouble(strWt);
        int height = Integer.parseInt(strHt);
        double ht=(double) height/100;
        System.out.println(weight+height);
        double bmi = (double)(weight/(ht*ht));
        System.out.println("Your BMI "+bmi);
    }
}
