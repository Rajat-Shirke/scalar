package DSA.twoPointsers;

public class subArrayWithGivenSum {
    public int[] solve(int[] A, int B) {
        int length=A.length;
        int p1=0,p2=0;
        int sum=A[0];

        while (p1<length&&p2<length){
            if(sum==B){
                break;
            } else if (sum>B) {

                sum=sum-A[p1];
                p1++;
                if(p1<length) {
                    if (p1 > p2) {
                        p2 = p1;
                        sum = A[p1];
                    }
                }
                else
                    break;

            }
            else {

                p2++;
                if(p2==length)
                {
                    break;
                }
                sum=sum+A[p2];

            }
        }
        if(sum!=B)
            return new int[]{-1};

        int[] res = new int[p2-p1+1];
        for (int i = p1,j=0; i <= p2 ; i++,j++) {
            res[j]=A[i];
        }
        return res;
    }
}
