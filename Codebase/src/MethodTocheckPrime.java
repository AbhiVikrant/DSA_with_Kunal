import java.util.Scanner;

// Define a method to find out if a number is prime or not.
public class MethodTocheckPrime {
    static boolean isPrime(int num)
    {
        if(num<=1)
            return false;
        if(num==2 || num==3)
            return true;
        if(num%2==0 || num%3==0)
            return false;
        for(int i=5; i<=Math.sqrt(num); i+=6)
        {
            if(num%i==0 || num%(i+2)==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        if(isPrime(num))
            System.out.println("It's a prime number");
        else
            System.out.println("It's not a prime number");

    }
}
