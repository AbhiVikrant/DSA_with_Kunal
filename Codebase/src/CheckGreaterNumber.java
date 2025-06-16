//5. Take 2 numbers as input and print the largest number.
import java.util.Scanner;

public class CheckGreaterNumber {
    static int findGreatestBetweenTwoNum(int a, int b)
    {
        return a>b?a:b;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a =sc.nextInt(), b=sc.nextInt();
        int result=findGreatestBetweenTwoNum(a,b);
        System.out.println("The two greatest number between"+a+" and "+b+" is "+result);
    }
}
