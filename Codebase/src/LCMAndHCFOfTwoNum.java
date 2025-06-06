import java.util.Scanner;
public class LCMAndHCFOfTwoNum {
    static int findLCM(int n1, int n2)
    {
        int ans=Math.max(n1,n2);
        while(true)
        {
            if(ans%n1==0 && ans%n2==0)
                break;
            ans++;
        }
       return ans;
    }
    static int findGCD(int a, int b)
    {
        // Everything is divisible by 0
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        // Both the numbers are equal
        if (a== b)
            return a;

        // x is greater
        if (a > b)
            return findGCD(a-b, b);
        return findGCD(a,b-a);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two nums");
        int a=sc.nextInt(),b=sc.nextInt();
        int lcm=findLCM(a,b);
        int gcd=findGCD(a,b);
        System.out.println("LCM of a and b is "+lcm);
        System.out.println("HCF of a and b is " +gcd);
    }
}
