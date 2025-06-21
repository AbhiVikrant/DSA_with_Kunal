//1480. Running Sum of 1d Array
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
//
//Return the running sum of nums.
//
//

import java.util.Arrays;

//Example 1:
//
//Input: nums = [1,2,3,4]
//Output: [1,3,6,10]
//Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
public class EasyArray3 {
    public static int[] runningSum(int[] nums) {
        int sum=0, ans[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            sum+=nums[i];
            ans[i]=sum;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int [] a={1,2,3,4};
        int [] out=runningSum(a);
        System.out.println(Arrays.toString(out));
    }
}
