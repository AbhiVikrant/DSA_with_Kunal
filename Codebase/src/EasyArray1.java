import java.util.Arrays;

// 1920. Build Array from Permutation
//Input: nums = [0,2,1,5,3,4]
//Output: [0,1,2,4,5,3]
public class EasyArray1 {
    public static int[] buildArray(int[] nums) {
        int ans[]=new int[nums.length];
        for(int i=0; i<nums.length; i++)
        {
            int a=nums[nums[i]];
            System.out.println(a);
            ans[i]=a;
        }
        return ans;
    }
    public static void main(String args[])
    {
        int [] nums =  {0,2,1,5,3,4};
        int[] output= buildArray(nums);
        System.out.println(Arrays.toString(output));
    }

}
