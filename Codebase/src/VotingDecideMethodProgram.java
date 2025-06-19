import java.util.Scanner;

//A person is eligible to vote if his/her age is greater than or equal to 18. Define a method to find out if he/she is eligible to vote.](https://www.efaculty.in/java-programs/voting-age-program-in-java/)
public class VotingDecideMethodProgram {
    static boolean decideAbletoVote(int age)
    {
        return age>=18?true:false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of the person");
        int age=sc.nextInt();
        if(decideAbletoVote(age))
            System.out.println("Person is eligible to vote");
        else
            System.out.println("Person is not eligible to vote");
    }
}
