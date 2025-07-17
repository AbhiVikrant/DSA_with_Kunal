import java.util.Arrays;

//34. Find First and Last Position of Element in Sorted Array
//Solved
//Medium
//Topics
//premium lock icon
//Companies
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
public class FindFirstandLastPositionOfElementInSortedArray {
    public static void main(String[] args) {
        int nums[]={5,7,7,8,8,10}, target=8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target)
    {
        int left=findLeftMostOccurance(nums,target);
        int right=findRightMostOccurance(nums,target);
        return new int[]{left,right};
    }
     static int findLeftMostOccurance(int[] nums, int target)
     {
         int index=-1,low=0,high=nums.length;
         while(low<=high)
         {
             int mid=low+(high-low)/2;
             if(nums[mid]==target)
             {
                 index=mid;
                 high=mid-1;
             }
             else if(target>nums[mid])
             {
                 low=mid+1;
             }
             else
             {
                 high=mid-1;
             }
         }
         return index;
     }
    static int findRightMostOccurance(int[] nums, int target)
    {
        int index=-1,low=0,high=nums.length;
        while(low<=high)
        {
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
            {
                index=mid;
                low=mid+1;
            }
            else if(target>nums[mid])
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return index;
    }
}
