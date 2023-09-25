package DSA.bitManipulation;

public class XorMaxSum_MaximumBits {
    public int solve(String A) {

        int res = 0;
        int len = A.length();
        for (int i = len - 1; i >= 0; i--) {
            if (A.charAt(i) == '0')
                res += 1 << (len - 1 - i);
        }
        return res;
    }
}
