import java.util.Scanner;

public class Conversion {
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);

        float b=0.4535f;//1 pound = 0.4535 kilograms
        float c;
        //conversion
        System.out.println("Enter kilograms = ");
        float a=sc.nextFloat();//kilogram
        c= a*b;
        System.out.println("Converted weight = "+c);
    }
}
