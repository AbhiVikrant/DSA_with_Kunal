/*
1295. Find Numbers with Even Number of Digits
        Solved
Easy
        Topics
premium lock icon
        Companies
Hint
Given an array nums of integers, return how many of them contain an even number of digits.



Example 1:

Input: nums = [13,345,2,6,7896]
Output: 2
Explanation:
        12 contains 2 digits (even number of digits).
        345 contains 3 digits (odd number of digits).
        2 contains 1 digit (odd number of digits).
        6 contains 1 digit (odd number of digits).
        7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.
*/

public class EasyArray16 {
    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums) {
        int evenNumbers = 0;
        for (int num : nums){
            System.out.println((int)Math.log10(num)%2);
            if ((int) Math.log10(num) % 2 == 1){
                evenNumbers ++;
            }
        }
        return evenNumbers;
    }
}
