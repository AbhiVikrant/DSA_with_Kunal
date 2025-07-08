import java.util.Arrays;

/*
1. Two Sum
Solved
Easy
Topics
premium lock icon
Companies
Hint
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.



Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class EasyArray21 {
    public static void main(String[] args) {
        int nums []= {2,7,11,15}, target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public  static int[] twoSum(int[] nums, int target) {
        int[] res=new int[2];
        int i=0,j=0,len=nums.length;
        while(i<len-1)
        {
            j=i+1;
            while(j<len)
            {
                if(nums[i]+nums[j]==target)
                {
                    res[0]=i;
                    res[1]=j;
                }
                j++;
            }
            i++;
        }
        return res;
    }
}
