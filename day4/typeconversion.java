package day3;

public class typeconversion {
    public static void main(String[] args) {
        //type casting:a. Upcasting
        String contactName = "Hemanth Kumar";
        System.out.println(contactName.toLowerCase());
        Object obj1 = contactName;//Upcasting
        //Since Object doesn't have upper case methode
        System.out.println(obj1);
        obj1 = 12.5;
        System.out.println(obj1);//Upcasting
        Object obj2 = false;
        Boolean data =(Boolean) obj2;//down casting
        System.out.println(data);
        //casting between data types
        long zeta = 88L; char alpha='\0';
        alpha = (char)zeta;//type casting long to char
        System.out.println(alpha);
        short micro = 92; int fella = 0;
        fella = micro;
        System.out.println(fella);
        float seek = 0.0F; seek = micro;
        System.out.println(seek);
        byte sigma = 0;sigma = (byte) micro;
        System.out.println(sigma);
        char check = 'R',match = 'a';
        check =(char)(check^match);
        match =(char)(check^match);
         check =(char)(check^match);
         System.out.println(check+" "+match);
    }
}
