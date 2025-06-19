import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a function that returns all prime numbers between two given numbers
public class MethodToReturnAllPrimeNumber {
    static boolean isPrime(int n)
    {
        int a=Math.abs(n);
        if(a==1)
            return false;

        if(a==2 || a==3)
            return true;
        if(a%2==0 || a%3==0)
            return false;
        for(int i=5; i<=Math.sqrt(a); i+=6)
        {
            if(a%i==0 || a%(i+2)==0)
                return false;
        }
        return true;

    }
    static List<Integer> getAllPrimeNumbers(int low, int high)
    {
        List<Integer> myList=new ArrayList<Integer>();
        for(int i=low; i<=high; i++)
        {
            if(isPrime(i))
                myList.add(i);
        }
        return myList;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range you want to print prime numbers");
        int low=sc.nextInt(), high=sc.nextInt();
        System.out.println(getAllPrimeNumbers(low,high));
    }
}
