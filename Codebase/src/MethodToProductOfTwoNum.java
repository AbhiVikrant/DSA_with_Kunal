import java.util.Scanner;

//Define a method that returns the product of two numbers entered by user.
public class MethodToProductOfTwoNum {
    static int product(int a, int b)
    {
        return a*b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int first=sc.nextInt(),second=sc.nextInt();
        System.out.println("Product of "+first+" and "+second+" is "+product(first,second));

    }
}
