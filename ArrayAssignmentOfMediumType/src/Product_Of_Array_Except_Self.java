import java.util.Arrays;
//238. Product of Array Except Self
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Hint
//Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
//
//The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
//
//You must write an algorithm that runs in O(n) time and without using the division operation.
public class Product_Of_Array_Except_Self {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        System.out.println("Original Array "+ Arrays.toString(nums));
        System.out.println("left sum array "+ Arrays.toString(leftArraySumExceptSelf(nums)));
        System.out.println("right sum array "+ Arrays.toString(rightArraySumExceptSelf(nums)));
        System.out.println("product except self "+ Arrays.toString(productOfElementExceptSelf(nums)));
    }
    static int[] leftArraySumExceptSelf(int [] nums)
    {
        int prefix=1,n=nums.length,res[]=new int[n];
        for(int i=0; i<n; i++)
        {
            res[i]=prefix;
            prefix=prefix*nums[i];
        }
        return res;
    }
    static int[] rightArraySumExceptSelf(int [] nums)
    {

        int postFix=1,n=nums.length,res[]=new int[n];
        for(int i=n-1; i>=0; i--)
        {
            res[i]=postFix;
            postFix=postFix*nums[i];
        }
        return res;
    }
//    leetcode  238
    static int[] productOfElementExceptSelf(int [] nums)
    {
      int n=nums.length;
//      find left sum first and store in a array
        int res[]=leftArraySumExceptSelf(nums);
//        loop from end to 0 and multiply with right as 1 and update right as right*num[i]
        int right=1;
        for(int i=n-1; i>=0; i--)
        {
            res[i]*=right;
            right*=nums[i];
        }
        return res;
    }
}
