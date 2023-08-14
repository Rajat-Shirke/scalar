package DSA;

import java.util.Arrays;
import java.util.List;

public class longestPalindrome {
//    public String longestPalindrome(String A) {
//        int len = A.length();
////acbcgcnybynggnybre
//        int ans=0,start=0,end=0;
//
//        for (int i = 0; i < len; i++) {
//            int p1 = i, p2 = i;
//            List S = palindrom(A, p1, p2);
//            int size = ((int) (S.get(1))-(int) (S.get(0)))+1;
//            start = (int) (S.get(0));
//            end = (int) (S.get(1));
//            if (size > ans) {
//                ans = size;
//                start = (int) (S.get(0));
//                end = (int) (S.get(1));
//            }
//        }
//        for (int i = 0; i < len-1; i++) {
//            int p1 = i, p2 = i+1;
//            List S = palindrom(A, p1, p2);
//            int size = ((int) (S.get(1))-(int) (S.get(0)))+1;
//            if (size > ans) {
//                ans = size;
//                start = (int) (S.get(0));
//                end = (int) (S.get(1));
//            }
//        }
//
//        String res= A.substring(start,end+1);
//        return res;
//    }


    public List palindrom(String A, int p1, int p2) {
        while (p1 >= 0 && p2 < A.length() && A.charAt(p1) == A.charAt(p2)) {

            p1--;
            p2++;

        }
        p1++;
        p2--;

        return Arrays.asList(p1, p2);


    }

    public List<Integer> longPalindrome(String input) {
        int len = input.length();
//acbcgcnybynggnybre
        int ans = 0, start = 0, end = 0;

        for (int i = 0; i < len; i++) {
            int p1 = i, p2 = i;
            List S = palindrom(input, p1, p2);
            int size = ((int) (S.get(1)) - (int) (S.get(0))) + 1;

            if (size > ans) {
                ans = size;
                start = (int) (S.get(0));
                end = (int) (S.get(1));
            }
        }
        for (int i = 0; i < len - 1; i++) {
            int p1 = i, p2 = i + 1;
            List S = palindrom(input, p1, p2);
            int size = ((int) (S.get(1)) - (int) (S.get(0))) + 1;
            if (size > ans) {
                ans = size;
                start = (int) (S.get(0));
                end = (int) (S.get(1));
            }
        }
        return Arrays.asList(start, end);
    }

    int inputLen = 0;

    public int minCut(String A) {
        inputLen = A.length();
        newCut(A);
        return result-1;
    }
    int result=0;

    public void newCut(String A) {
        int start = 0, end = A.length() - 1;


        if (start == end) {
            result++;
            return;
        }
        List<Integer> startAndEndIndex = longPalindrome(A);
        if((startAndEndIndex.get(1)-startAndEndIndex.get(0)+1)==A.length())
        {
            result++;
            return;
        }


        if (startAndEndIndex.get(0) > 0) {
            newCut(A.substring(start, startAndEndIndex.get(0)));
        }
        if (startAndEndIndex.get(1) < A.length() - 1)
            newCut(A.substring(startAndEndIndex.get(1)+1, end+1));




        result++;
    }
}
