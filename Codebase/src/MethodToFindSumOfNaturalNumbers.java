import java.util.Scanner;

public class MethodToFindSumOfNaturalNumbers {
    static int findSumOfNNaturalNumber(int n)
    {
        int sum=0;
        if(n<1)
            return 0;
        for(int i=1; i<=n; i++)
        {
            sum+=i;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter upto what you want find sum natural num only");
        int a=sc.nextInt();
        System.out.println("Sum of "+a+" natural numbers is "+findSumOfNNaturalNumber(a));
    }
}
