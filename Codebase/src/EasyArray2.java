//1929. Concatenation of Array
//Solved
//Easy
//Topics
//Given an integer array nums of length n, you want to create an array ans of length 2n where ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).
//
//Specifically, ans is the concatenation of two nums arrays.
//
//Return the array ans.

import java.util.Arrays;

//Input: nums = [1,2,1]
//Output: [1,2,1,1,2,1]
public class EasyArray2 {
    public static int[] getConcatenation(int[] nums) {
        int ans[]=new int[2*nums.length];
        for(int i=0; i<nums.length; i++)
        {
            ans[i]=ans[i+nums.length]=nums[i];
            System.out.println(ans[i]+" "+ans[i+nums.length]);
        }
        return ans;

    }
    public static void main(String args[])
    {
        int [] nums = {1,2,1};

        System.out.println(getConcatenation(nums)); // prints address
        int[] output=getConcatenation(nums);
        System.out.println(Arrays.toString(output));

//        Output: [1,2,1,1,2,1]
    }
}
