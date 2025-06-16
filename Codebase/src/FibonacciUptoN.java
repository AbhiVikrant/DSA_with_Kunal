import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//To calculate Fibonacci Series up to n numbers.
public class FibonacciUptoN {
    static int findFibonacci(int n)
    {
        // base case
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        return findFibonacci(n-2)+findFibonacci(n-1);
    }
    static List<Integer> fibonacciNumbers(int n)
    {
        List<Integer> ans=new ArrayList<>();
        for(int i=0; i<n; i++)
            ans.add(findFibonacci(i));
        return ans;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        List<Integer> ans=new ArrayList<>();
        ans=fibonacciNumbers(n);
        System.out.println(ans);
    }
}
