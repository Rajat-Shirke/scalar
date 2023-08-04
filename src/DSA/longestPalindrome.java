package DSA;

import java.util.Arrays;
import java.util.List;

public class longestPalindrome {
    public String longestPalindrome(String A) {
        int len = A.length();

        int ans=0,start=0,end=0;

        for (int i = 0; i < len; i++) {
            int p1 = i, p2 = i;
            List S = palindrom(A, p1, p2);
            int size = ((int) (S.get(1))-(int) (S.get(0)))+1;
            if (size > ans) {
                ans = size;
                start = (int) (S.get(0));
                end = (int) (S.get(1));
            }
        }
        for (int i = 0; i < len-1; i++) {
            int p1 = i, p2 = i+1;
            List S = palindrom(A, p1, p2);
            int size = ((int) (S.get(1))-(int) (S.get(0)))+1;
            if (size > ans) {
                ans = size;
                start = (int) (S.get(0));
                end = (int) (S.get(1));
            }
        }

        String res= A.substring(start,end+1);
        return res;
    }


    public List palindrom(String A, int p1, int p2) {
        while (p1>=0 && p2<A.length()&& A.charAt(p1)==A.charAt(p2))
        {

            p1--;
            p2++;

        }
        p1++;
        p2--;

        return Arrays.asList(p1,p2);


    }
}
