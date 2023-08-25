package DSA.bitManipulation;

public class singleNumber {
    public int SingleNumber(int[] nums) {
        int N = nums.length;

        int ans=0;
        for(int i=0;i<N;i++)
        {
            ans = (ans ^ nums[i]);
        }
        return ans;
    }
}
