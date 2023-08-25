package DSA.bitManipulation;

public class countSetBits {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            int c = 0;
            int Num = i;
            while (Num > 0) {
                if ((Num & 1) == 1)
                    c++;
                Num = Num >> 1;
            }
            res[i] = c;
        }
        return res;
    }
}
