// Find the numbers that have even number of digits
// arr=[18,124,9,1734,89,98]
// ans=3
public class FindNumbersHavingEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] arr={18,124,9,1734,89,98,1000,-1000};
        System.out.println(findNumbersHavingEvenNumberOfDigits(arr));
    }
    static int countDigit(int num)
    {
        int a=Math.abs(num);
        String str=Integer.toString(a);
        return str.length();
    }
    static int findNumbersHavingEvenNumberOfDigits(int []arr)
    {
        int ans=0;
        for(int nums: arr)
        {
            int countOfDigit=countDigit(nums);
            if(countOfDigit%2==0)
                ans++;
        }
        return ans;
    }

}
