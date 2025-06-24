import java.util.Arrays;

public class StringCharSearch {
    public static void main(String args[])
    {
        String str="Abhishek";
        char target='c';
        System.out.println(charSearchInString(str,target));
//        Only toCharArray
        System.out.println((str.toCharArray()));// Abhishek
        System.out.println(Arrays.toString(str.toCharArray()));// [A, b, h,i,s,h,e,k]
        System.out.println(charSearch2(str,'e'));
    }
    static boolean charSearchInString(String str, char target)
    {
        String str1=str.toLowerCase();
//        checking for empty string
        if(str1.isEmpty())
            return false;
        for(int i=0; i<str.length(); i++)
        {
            if(target==str1.charAt(i))
                return true;
        }
        return false;
    }
//     using enhanced for loop i.e. for each needs collection so first convert string to array
    static boolean charSearch2(String str, char target)
    {
        String str1=str.toLowerCase();
        if(str1.isEmpty())
        {
            return false;
        }
        for(char ch: str1.toCharArray())
        {
            if(ch==target)
            {
                return true;
            }
        }
        return false;
    }

}
