import java.util.Scanner;

public class PerimeterAllProgram {
    static int findPerimeterOfRectangle(int a, int b)
    {
        return 2*(a+b);
    }
    static float perimeterOFCircle(int r)
    {
        return (float)(2*22*r)/7;
    }
//    perimeterOFEquilateralTraingle
    static int perimeterOFEquilateralTraingle(int a){
        return 3*a;
    }

    public static void main(String[] a)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice for finding perimeter like rectangle");
        String str=sc.nextLine();
        switch(str)
        {
            case "rectangle":
            {
                System.out.println("Enter length and breadth of rectangle");
                int len=sc.nextInt(),width=sc.nextInt();
                System.out.println("Perimeter of rectangle is "+findPerimeterOfRectangle(len,width));
            }
            case "circle":
            {
                System.out.println("Enter radius of circle");
                int r=sc.nextInt();
                System.out.println("Perimeter of circle is "+perimeterOFCircle(r));
            }
            case "equilateralTraingle":
            {
                System.out.println("Enter side of equilateral traingle");
                int r =sc.nextInt();
                System.out.println("Perimeter of eqilateral traingle is "+perimeterOFEquilateralTraingle(r));
            }
        }

    }
}
