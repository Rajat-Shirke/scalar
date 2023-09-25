package DSA.bitManipulation;

public class countSetbitsFrom1toN {
    public int solve(int A) {
        int count = 0;
        int N = A+1;
        for(int i = 1; i < 32; i++) {
            int rem_val = N%(1<<i)-(1<<(i-1));
            rem_val= Math.max(rem_val, 0);
            int pos_count= ((N/(1<<i)*(1<<(i-1)))+rem_val);
            count =(count+pos_count)%1000000007;
        }
        return count;
    }

    public int hammingWeight(int n) {
        int c = 0;
        while (n > 0) {
            if ((n & 1) == 1)
                c++;
            n = n >> 1;
        }
        return c;
    }
}
