import java.util.Arrays;

public class EasyArray24 {
    public static void main(String[] args) {
        int nums[]={-2, 1,-3,4,-1,2,1,-5,4};
        System.out.println(findMaximumSubArraySumAndPrintElement(nums));
        int arr[] ={2, 3, -8, 7, -1, 2, 3};
        System.out.println(maximumSum(arr));
    }
    static int findMaximumSubArraySumAndPrintElement(int[] nums)
    {
        int max=nums[0],start=0,end=0;
        for(int i=0; i<nums.length-1; i++)
        {
            int j=i+1;
            int currentSum=nums[i];
            while(j<nums.length)
             {
                    currentSum=currentSum+nums[j];
                    max=Math.max(currentSum,max);
                    j++;
                }
            }
        //System.out.println(start+"FF"+end);
        return max;
    }
//    Naive Approach
    static int maximumSum( int [] arr)
    {
        int res=arr[0],start=0,end=0;
        // outer loop for starting point of subarray
        for(int i=0; i<arr.length; i++)
        {
            int currentSum=0;
            // inner loop for ending point of subarray
            for(int j=i; j<arr.length; j++)
            {
                currentSum=currentSum+arr[j];
                if(currentSum>res)
                {
                    res=currentSum;
                    start=i;
                    end=j;
                }
            }

        }
        int[] newResArr=Arrays.copyOfRange(arr,start,++end);
        System.out.println(Arrays.toString(newResArr));
        return res;
    }
}
