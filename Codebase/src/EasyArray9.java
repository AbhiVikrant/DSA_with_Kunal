import java.util.ArrayList;
import java.util.Arrays;

//1389. Create Target Array in the Given Order
//Solved
//Easy
//Topics
//premium lock icon
//Companies
//Hint
//Given two arrays of integers nums and index. Your task is to create target array under the following rules:
//
//Initially target array is empty.
//From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
//Repeat the previous step until there are no elements to read in nums and index.
//Return the target array.
//
//It is guaranteed that the insertion operations will be valid.
//
//
//
//Example 1:
//
//Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
//Output: [0,4,1,3,2]
//Explanation:
//nums       index     target
//0            0        [0]
//1            1        [0,1]
//2            2        [0,1,2]
//3            2        [0,1,3,2]
//4            1        [0,4,1,3,2]
public class EasyArray9 {
    public static void main(String[] args)
    {
        int nums[]={0,1,2,3,4},index[]={0,1,2,2,1};
      System.out.println(Arrays.toString(createTargetArray(nums,index)));
    }
    public static int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer>arr=new ArrayList<Integer>();
        for(int i=0; i<nums.length; i++)
        {
            arr.add(index[i], nums[i]);
            System.out.println(arr);
        }
        int target[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            target[i]=arr.get(i);
        }
        return target;
    }
}
