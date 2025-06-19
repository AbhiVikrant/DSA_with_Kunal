import java.util.Scanner;

public class MethodToCheckPythagorean {
    static boolean isPythorean(int a, int b, int c)
    {
        if((Math.pow(a,2)+Math.pow(b,2)==Math.pow(c,2)) || (Math.pow(b,2)+Math.pow(c,2)==Math.pow(a,2)) ||
                (Math.pow(c,2)+Math.pow(a,2)==Math.pow(b,2)))
            return true;
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers to check whether its a pythogorean ");
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        System.out.println(isPythorean(a,b,c));
    }
}
