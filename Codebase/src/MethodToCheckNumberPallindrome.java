import java.util.Scanner;
//Write a function to find if a number is a palindrome or not. Take number as parameter.
public class MethodToCheckNumberPallindrome {
    static boolean checkPallindrome(int n)
    {
        //int num=n;
        int num=Math.abs(n);// to work for negative number also
        int revNum=0;
        while(num>0)
        {
            int digit=num%10;
            //System.out.println(digit);
            revNum=revNum*10+digit;
            System.out.println(revNum);
            num=num/10;
        }
        System.out.println(revNum);
        if(revNum==n)
            return true;
        return false;
    }
    // 2nd approach

    static boolean isPallindrome(int num)
    {
        // convert number to string
        String str=Integer.toString(num);
        int len=str.length();
        for(int i=0; i<len/2; i++)
        {
            if(str.charAt(i)!= str.charAt(len-i-1))
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(checkPallindrome(num))
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
        if(isPallindrome(num))
            System.out.println("Pallindrome Number");
        else
            System.out.println("Not Pallindrome Number");
    }
}
