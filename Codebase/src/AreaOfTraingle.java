import java.util.Scanner;
public class AreaOfTraingle {
    static double findAreaOfTraingleUsingBaseAndHeight(int b, int h)
    {
        return (b*h)/2;
    }
    static double findAraeOfTraingleUsingSide(int a, int b, int c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("There are mainly two ways to find area either by side length or by providing base and height Enter s or b");
        char ch=sc.nextLine().charAt(0);
        switch(ch)
        {
            case 's':
            {
                System.out.println("Enter length of sides of traingle");
                int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
                System.out.println("Area of traingle is "+findAraeOfTraingleUsingSide(a,b,c));
            }
            case 'b':
            {
                System.out.println("Enter base and height of traingle");
                int b=sc.nextInt(),h=sc.nextInt();
                double d=findAreaOfTraingleUsingBaseAndHeight(b,h);
                System.out.println("Area of traingle is "+d);
            }
            default:
                System.out.println("ghhg");
        }
    }
}
