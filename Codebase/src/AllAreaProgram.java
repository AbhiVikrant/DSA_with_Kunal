import java.util.Scanner;

public class AllAreaProgram {
    static int areaOfRectangle(int l, int b)
    {
        return l*b;
    }
//    Area Of Isosceles Triangle
    static double areaOfisoscelesTriangle(int a, int b)
    {
        return (b*(Math.sqrt((Math.pow(a,2)-(Math.pow(b,2)/4)))))/2;
    }
//    Area Of Parallelogram
    static int areaOfParallelogram(int a, int b)
    {
        return a*b;
    }
//    Area Of Rhombus
    static float findAreaOfRhombus(int d1, int d2)
    {
        return (float) (d1 * d2) /2;
    }
//    Area Of Equilateral Triangle
    static float findAreaOfEquilateralTriangle(int a)
    {
        return (float)(Math.sqrt(3)*Math.pow(a,2))/4;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice to find area like for rectangle type rectangle");
        String choice=sc.nextLine();
        switch (choice)
        {
            case "rectangle":
            {
                System.out.println("Enter the length and breadth of rectangle");
                int a=sc.nextInt(), b=sc.nextInt();
                System.out.println("Area of rectangle is "+areaOfRectangle(a,b));

            }
            case "isoscelesTriangle":
            {
                System.out.println("Enter the common sides  and base of an isosceles triangle");
                int a=sc.nextInt(), b=sc.nextInt();
                System.out.println("Area of isosceles triangle is "+areaOfisoscelesTriangle(a,b));
            }
            case "parallelogram":
            {
                System.out.println("Enter the base and height of a parallelogram");
                int a=sc.nextInt(), b=sc.nextInt();
                System.out.println("Area of parallelogram is "+areaOfParallelogram(a,b));
            }
            case "rhombus":
            {
                System.out.println("Enter the diagonals of a rhombus");
                int d1=sc.nextInt(), d2=sc.nextInt();
                System.out.println("Area of rhombus is "+findAreaOfRhombus(d1,d2));
            }
            case "equilateralTriangle":
            {
                System.out.println("Enter the side of an  equilateral triangle");
                int s=sc.nextInt();
                System.out.println("Area of rhombus is "+findAreaOfEquilateralTriangle(s));
            }
        }
    }
}
