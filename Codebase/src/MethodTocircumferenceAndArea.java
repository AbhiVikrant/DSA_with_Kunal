import java.util.Scanner;

// Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class MethodTocircumferenceAndArea {
    static int circumference(int radius)
    {
        return (int)(2*22*radius)/7;
    }
    static int areaOfCircle(int radius)
    {
        double area=((double) 22 /7)*Math.pow(radius,2);
        return (int) area;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        int radius=sc.nextInt();
        System.out.println("Circumference  and area of circle in int part only are "+circumference(radius) +"cm "+ "and " +areaOfCircle(radius)+"cm^2");

    }
}
