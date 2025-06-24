public class StringCharSearch {
    public static void main(String args[])
    {
        String str="Abhishek";
        char target='c';
        System.out.println(charSearchInString(str,target));
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
}
