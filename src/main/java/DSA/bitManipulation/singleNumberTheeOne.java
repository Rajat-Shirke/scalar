package DSA.bitManipulation;

public class singleNumberTheeOne {
    public int SingleNumber(int[] nums) {
        int unq=0;
        int N = nums.length;
        for(int i=0;i<32;i++)
        {
            int c=0;
            for(int j=0;j<N;j++)
            {
                if(((nums[j]>>i)&1)==1)
                {
                    c++;
                }
            }
            if(c%3==1)
            {
                unq+=(1<<i);
            }
        }
        return unq;
    }
}
