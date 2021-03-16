import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] sq = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int j=0;
            j=nums[i]*nums[i];
            sq[i]=j;
        }
        Arrays.sort(sq);
        return sq;
    }
}
