import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class EvenOrOddMethod {
    static void printEvenOrOdd(int num)
    {
        if(num%2==0)
            System.out.println("It's a even number");
        else
            System.out.println("It's an odd number");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        printEvenOrOdd(num);
    }
}
