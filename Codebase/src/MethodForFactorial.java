import java.util.Scanner;

//[Write a program to print the factorial of a number by defining a method named 'Factorial'.](https://www.javatpoint.com/factorial-program-in-java)
//Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.- <br/>
//<pre>
//4! = 1 * 2 * 3 * 4 = 24
//3! = 3 * 2 * 1 = 6
//2! = 2 * 1 = 2
//Also,
//1! = 1
//0! = 1
//</pre>
public class MethodForFactorial {
    static int factorial(int n)
    {
        if(n==0 || n==1)
            return 1;
        return n*factorial(n-1);

    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        System.out.println("Factorial of "+num +" is "+factorial(num));

    }
}
