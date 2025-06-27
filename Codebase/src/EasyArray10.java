import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

//1832. Check if the Sentence Is Pangram
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//A pangram is a sentence where every letter of the English alphabet appears at least once.
//
//Given a string sentence containing only lowercase English letters, return true if sentence is a pangram, or false otherwise.
//
//
//
//Example 1:
//
//Input: sentence = "thequickbrownfoxjumpsoverthelazydog"
//Output: true
//Explanation: sentence contains at least one of every letter of the English alphabet.
//Example 2:
//
//Input: sentence = "leetcode"
//Output: false
public class EasyArray10 {
    public static void main(String[] args) {
       System.out.println(checkIfPangram("abcdefghijklmnopqrstuvwxyz"));
        System.out.println(checkIfPangram2("abhishekkumarvikrant"));

    }
    public static boolean checkIfPangram(String sentence) {
         boolean check[]=new boolean[26];
         for(int i=0; i<sentence.length(); i++)
         {
            char ch=sentence.charAt(i);
            check[ch-'a']=true;
         }
        System.out.println((Arrays.toString(check)));
        for(int i=0; i< check.length; i++)
        {
            if(!check[i])
                return false;
        }
        return true;
    }
//    2nd way

    public static boolean checkIfPangram2(String sentence) {
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};

        for(char ch : alphabet){
            if(!sentence.contains(String.valueOf(ch))){
                return false;
            }
        }
        return true;
    }
}
