package DSA;

public class Adv_Array {

    public int solve(int[][] A, int B) {
        int N=A.length,M=A[0].length;
        int ans=Integer.MAX_VALUE;

        for (int i = 0; i < N; i++) {
            if(B>=A[i][0]&&B<=A[i][M-1]) {
                int first = 0, last = M - 1;
                int mid = (first + last) / 2;
                while (first <= last) {
                    if (A[i][mid] < B) {
                        first = mid + 1;
                    } else if (A[i][mid] == B) {
                        int val=(i+1)*1009+(mid+1);
                        ans=Integer.min(val,ans);
                        break;
                    } else {
                        last = mid - 1;
                    }
                    mid = (first + last) / 2;
                }
                if(first<=last)
                {
                    int j=mid-1,k=mid+1;
                    while(j>=0&&A[i][j]==A[i][mid])
                    {
                        int val=(i+1)*1009+j+1;
                        ans=Integer.min(val,ans);
                        j--;
                    }
                }
            }
        }
        if(ans==Integer.MAX_VALUE)
        {
            return -1;
        }
        return ans;
    }
//-------All Sub matrix sum---------
//    public int solve(int[][] A) {
//        int sum=0,N=A.length,M=A[0].length;
//        for (int i = 0; i < N; i++) {
//            for (int j = 0; j < A[0].length; j++) {
//                sum+=(A[i][j]*(i+1)*(j+1)*(N-i)*(M-j));
//            }
//        }
//        return sum;
//    }
//    //--------------Row with maximum number of ones
//    public int solve(int[][] A) {
//
//        int N = A.length;
//        int M = A[0].length;
//        int row=0,max_count = 0;;
//        for (int i = 0; i < N; i++) {
//           int count =0;
//            for (int j = 0; j < M; j++) {
//                if(A[i][j]==1)
//                {
//                    count++;
//                }
//            }
//            if(count>max_count)
//            {
//                row=i;
//                max_count=count;
//            }
//        }
//        return row;
//    }
}
