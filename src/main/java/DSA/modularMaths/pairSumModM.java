package DSA.modularMaths;

import java.util.HashMap;

public class pairSumModM {
    public int solve(int[] A, int B) {
        int N=A.length;
        long ans=0;
        HashMap<Integer, Integer> modB = new HashMap<>();
        for(int i=0;i<B;i++)
        {
            modB.put(i,0);
        }
        for (int j : A) {
            int AiMod = j % B;
            modB.put(AiMod, modB.get(AiMod) + 1);
        }
        long x0=modB.get(0);
        ans=(x0*(x0-1))/2;
        //ans = ans%B;
        if(B%2==0)
        {
            long x1=modB.get(B/2);
            ans+=(x1*(x1-1)/2);
            //ans = ans%B;
        }
        int l=1,r=B-1;
        while(l<r)
        {
            ans+=(modB.get(l)*modB.get(r));
            //ans = ans%B;
            l++;r--;
        }
        return (int)(ans%1000000007);
    }
}
