import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value.
//(Use if conditions)
public class OperatorConditionals {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers and an operater among +, -, x, /, %");
        int a=sc.nextInt(),b=sc.nextInt();
        char ch=sc.next().charAt(0);
        if(ch=='+')
            System.out.println("Sum "+(a+b));
        else if(ch=='-')
            System.out.println("Diff is "+(a-b));
        else if(ch=='*')
            System.out.println("a multiply b is "+a*b);
        else if(ch=='/')
            System.out.println("a divides b is "+a/b);
        else
            System.out.println("a modulus b is "+a%b);

    }
}
