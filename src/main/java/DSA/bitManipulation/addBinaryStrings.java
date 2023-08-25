package DSA.bitManipulation;


import java.util.ArrayList;

public class addBinaryStrings {
    public String addBinary(String A, String B) {
        ArrayList<Character> l1 = new ArrayList<>();
        //string res="";
        int ansLen = 0, carry = 0, sum = 0;
        int i = A.length() - 1;
        int j = B.length() - 1;
        while (i >= 0 || j >= 0 || carry > 0) {
            sum = carry;
            if (i >= 0)
                sum += (A.charAt(i) - '0');
            if (j >= 0)
                sum += (B.charAt(j) - '0');
            l1.add((char) ('0' + sum % 2));//res+=((char)('0' + sum % 2));
            carry = sum / 2;
            i--;
            j--;
        }
        StringBuilder ans = new StringBuilder();
        for (i = l1.size() - 1; i >= 0; i--) {
            ans.append(l1.get(i));
        }
        return String.valueOf(ans);
    }
}
