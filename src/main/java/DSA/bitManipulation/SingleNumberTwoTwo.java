package DSA.bitManipulation;

public class SingleNumberTwoTwo {
    public int[] SingleNumber(int[] nums) {
        int val = 0;
        int N = nums.length;
        for (int i = 0; i < N; i++) {
            val ^= nums[i];
        }
        int pos = 0;
        for (int i = 0; i < 32; i++) {
            if (((val >> i) & 1) == 1) {
                pos = i;
                break;
            }
        }
        int setb = 0, unsetb = 0;
        for (int i = 0; i < N; i++) {
            if (((nums[i] >> pos) & 1) == 1) {
                setb ^= nums[i];
            } else {
                unsetb ^= nums[i];
            }
        }
        return new int[]{setb, unsetb};
    }
}
