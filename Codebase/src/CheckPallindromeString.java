import java.util.Scanner;

//To find out whether the given String is Palindrome or not.
public class CheckPallindromeString {
//    Naive approach
    static boolean checkPallindrome(String str)
    {
        int len=str.length();
        String rev="", str1=str.toLowerCase();

        for(int i=0; i<len; i++)
        {
            char ch=str1.charAt(i);
            rev=ch+rev;
        }
        if(rev.equals(str1))
            return true;
        else
            return false;

    }

//    Two pointer approach

    static boolean checkPallindromeUsingTwoPointer(String str)
    {
        int i=0, j=str.length()-1;
        String str1=str.toLowerCase();
        while(i<j)
        {
            if(str1.charAt(i)!=str1.charAt(j))
                return  false;
            i++;
            j--;
        }
        return true;
    }

//

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check whether it's a pallindrome or not");
        String str=sc.nextLine();
        boolean ch=checkPallindrome(str);
        boolean check=checkPallindromeUsingTwoPointer(str);
        if(check)
            System.out.println("Pallindrome");
        else
            System.out.println("Not Pallindrome");
//       String builder

        String s = "GeeksForGeeks";

        // Create a StringBuilder object
        //with the original string
        StringBuilder s1 = new StringBuilder(s);

        // Reverse the string
        // using the reverse() method
        s1.reverse();

        // Compare the reversed string
        // with the original string
        if (s.equals(s1.toString())) {
            System.out.println("\"" + s + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + s + "\" is not a palindrome string.");
        }
    }
}
