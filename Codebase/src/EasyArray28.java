/*
1217. Minimum Cost to Move Chips to The Same Position
Solved
Easy
Topics
premium lock icon
Companies
Hint
We have n chips, where the position of the ith chip is position[i].

We need to move all the chips to the same position. In one step, we can change the position of the ith chip from position[i] to:

position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.


 */
public class EasyArray28 {
    public static void main(String[] args) {
        int [] pos={2,2,2,3,3};
        System.out.println(minCostToMoveChips(pos));
    }
    public static int minCostToMoveChips(int[] position) {
        int evenCount=0,oddCount=0;
        for(int pos:position)
        {
            if(pos%2==0)
                evenCount+=1;
            else
                oddCount+=1;
        }
        System.out.println(oddCount);
        return Math.min(oddCount,evenCount);
    }
}
