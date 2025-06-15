import java.util.Scanner;

//Write a program to input principal, time, and rate (P, T, R) from the user and
//find Simple Interest.
public class SimpleIntrest {
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle, rate and time in year respectively");
        float p=sc.nextFloat(),r=sc.nextFloat(),t=sc.nextFloat();
        double si=(p*r*t)/100;
        System.out.println("SI on above principal "+p+" for "+t +" years at "+r+"% is "+si);
    }
}
