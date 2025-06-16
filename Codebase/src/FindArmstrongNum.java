import java.util.Scanner;

// To find Armstrong Number between two given number.
public class FindArmstrongNum {
    // A number is called argmstrong if pqr=np+nq+nr

//     function to calculate digit of number
    static int countOfDigit(int n)
    {
        if(n<=9 && n>=0)
            return 1;
        int d=0;
        while(n>0)
        {
            n=n/10;
            ++d;
        }
        return d;
    }

//     check armstrong
    static boolean checkArmstrong(int n)
    {
        int digits=countOfDigit(n), num=n,sum_power=0;
        while(num!=0)
        {
          int d=num%10;
          sum_power+=Math.pow(d,digits);
          num=num/10;
        }
        if(sum_power==n)
            return true;
        return false;
    }

//     function to print all nums argmstrong b/w a and b
    static void printNums(int a, int b)
    {
        for(int i=a+1; i<b; ++i )
        {
            if(checkArmstrong(i))
                System.out.print(i+" ");
        }
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        int a =sc.nextInt(),b=sc.nextInt();
        printNums(a,b);

    }
}
