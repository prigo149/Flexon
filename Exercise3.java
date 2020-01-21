public class Exercise3 {
    public static void main(String[] args){
        double a=20d;
        double b=80d;
        double c;

        c=(a+b)*25; //adding two elements and multiplying it by 25
        System.out.println("Total = "+c);

        double d= c/40;//to find remainder

        System.out.println("Remainder = "+d);

        if (d<20)
            System.out.println("Total is under the limit");
        else
        System.out.println("Total is over the limit");
    }
}
