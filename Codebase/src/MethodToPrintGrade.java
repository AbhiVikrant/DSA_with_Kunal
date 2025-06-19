import java.util.Scanner;

//Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:](https://www.techcrashcourse.com/2017/02/java-program-to-calculate-grade-of-students.html) <br/>
//<pre>
//Marks        Grade
//91-100         AA
//81-90          AB
//71-80          BB
//61-70          BC
//51-60          CD
//41-50          DD
//<=40          Fail
//</pre>
public class MethodToPrintGrade {
    static void printGrade(int marks)
    {
        if(marks>90)
            System.out.println("AA");
        else if(marks>80 && marks<=90)
            System.out.println("AB");
        else if(marks>70 && marks<=80)
            System.out.println("BB");
        else if(marks>60 && marks<=70)
            System.out.println("BC");
        else if(marks>50 && marks<=60)
            System.out.println("CD");
        else if(marks>40 && marks<=50)
            System.out.println("DD");
        else
            System.out.println("Fail");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks out of 100");
        int marks=sc.nextInt();
        printGrade(marks);
    }
}
