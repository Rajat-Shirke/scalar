package DSA;

public class powerFunction {
    public int pow(int A, int B, int C) {
        long ans =0;
        if(A==0)
            return 0;
        if (B==0)
            return 1;
        ans = pow(A,B/2,C)%C;
        ans = (ans*ans)%C;
        if(B%2==1)
            ans=(ans*A)%C;

        ans=(ans+C)%C;
        return (int)ans;
    }
}
