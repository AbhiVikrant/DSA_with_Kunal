import java.util.Scanner;

// Area Of Circle Java Program
public class AreaOfCircle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of a circle");
        double r=sc.nextDouble();
        double d= (double) 22 /7*Math.pow(r,2);
        System.out.println("Area of circle having radius as "+r+" is "+d);
    }
}
