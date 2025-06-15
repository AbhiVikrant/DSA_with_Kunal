import java.util.Scanner;
//Write a program to print whether a number is even or odd, also take
//input from the user.
public class CheckEvenOdd {
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=sc.nextInt();
        if(a%2==0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }
}
