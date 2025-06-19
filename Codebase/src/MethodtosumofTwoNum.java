import java.util.Scanner;

//Write a program to print the sum of two numbers entered by user by defining your own method.
public class MethodtosumofTwoNum {
    static int addition(int a, int b)
    {
        return a+b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int first=sc.nextInt(),second=sc.nextInt();
        System.out.println("Sum of "+first+" and "+second+" is "+addition(first,second));

    }
}
