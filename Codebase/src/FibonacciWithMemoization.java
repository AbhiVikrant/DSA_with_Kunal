import java.util.Arrays;
import java.util.Scanner;

// find nth fibonacci number using memo
public class FibonacciWithMemoization {
    static int nthFibonacciUtil(int n, int[] memo)
    {
        // base case
        if(n<=1)
            return n;
        // check result if in memo
        if(memo[n]!=-1)
            return memo[n];
        memo[n]=nthFibonacciUtil(n-1,memo)+nthFibonacciUtil(n-2,memo);
        return memo[n];
    }
    // wrapper function for both initialisation and find nth fibonacci num
    static int nthFib(int n)
    {
        int [] memo=new int[n+1];
        Arrays.fill(memo,-1);
        return nthFibonacciUtil(n,memo);
    }
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        System.out.println(n+"th fibonacci is "+nthFib(n));
    }
}
