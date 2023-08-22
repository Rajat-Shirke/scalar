package DSA.modularMaths;

public class primeModuloInverse {
    public int solve(int A, int B) {
        int ans=0;
        int val=A%B;
        for(int i=1;i<B;i++)
        {
            if(((val*i)%B)==1)
            {
                ans = i;
                break;

            }
        }
        return ans;
    }
}
