package Threads;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.KeyPair;
import java.util.*;

public class test {


    //-----------Distinct Numbers in Window
//    public int[] dNums(int[] A, int B) {
//        int N = A.length;
//        if(B>N)
//        {
//            int[] ar ={};
//            return ar;
//        }
//        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
//        HashMap<Integer,Integer> valCount = new HashMap<Integer, Integer>();
//        int left =1,right=B,count=0;
//
//        for (int i = 0; i < B; i++) {
//            if(valCount.containsKey(A[i]))
//            {
//                valCount.put(A[i],valCount.get(A[i])+1);
//            }
//            else
//            {
//                valCount.put(A[i],1);
//            }
//
//        }
//        count=valCount.size();
//        hashMap.put(0,count);
//
//        while(right<N)
//        {
//            //Remove left element
//            if(valCount.get(A[left-1])>1)
//            {
//                valCount.put(A[left-1],valCount.get(A[left-1])-1);
//            }
//            else
//            {
//                valCount.remove(A[left-1]);
//            }
//            //Add right element
//            if(valCount.containsKey(A[right]))
//            {
//                valCount.put(A[right],valCount.get(A[right])+1);
//            }
//            else
//            {
//                valCount.put(A[right],1);
//            }
//            count=valCount.size();
//            hashMap.put(left,count);
//            left++;
//            right++;
//        }
//        //filling res array from disct count hashmap
//        int hm_count = hashMap.size();
//        int[] res = new int[hm_count];
//        for (int i = 0; i < hm_count; i++) {
//            res[i]=hashMap.get(i);
//        }
//
//        return res;
//    }
//--------------------Sub Array with given sum---------
//    public int[] solve(int[] A, int B) {
//        int N = A.length;
//        int sum=0,left=0,right=0;
//        while (right<N)
//        {
//            sum= 0;
//            for (int k = left; k <= right; k++) {
//                sum+=A[k];
//            }
//            if(sum<B)
//            {
//                right++;
//            }
//            else if(sum>B)
//            {
//                left++;
//            }
//            else
//            {
//                break;
//            }
//        }
//        if(sum==B)
//        {
//            int count = right-left+1;
//            int[] res = new int[count];
//            for (int k = 0; k < count; k++) {
//                res[k]=A[left+k];
//            }
//            return res;
//        }
//        else
//        {
//            return new int[]{-1};
//        }
//
//    }
    // DFS
//    public int solve(int[] A, final int B, final int C) {
//        int N = A.length;
//        ArrayList<Integer>[] g = new ArrayList[N+1];
//        for (int i = 1; i <= N; i++)
//        {
//            g[A[i]].add(i + 1);
//
//        }
//        int[] vis = new int[N+1];
//        Arrays.fill(vis,0);
//
//        DFS(g, vis, C, B,N);
//        return vis[B];
//    }
//
//
//    void DFS(ArrayList<Integer>[] g, int[] vis, int s, int d, int N)
//    {
//        if(s>=N)
//        {
//            return;
//        }
//        if (vis[s]==1)
//        {
//            return;
//        }
//        vis[s] = 1;
//
//        for (int i = 0; i < g[s].size(); i++)
//        {
//            int n = g[s].get(i);
//            DFS(g, vis, n, d,N);
//        }
//    }
    //Leap Year or not
//    public int solve(int A) {
//        if(A%400==0 || (A%4==0 && A%100!=0))
//        {
//            return 1;
//        }
//        else
//        {
//            return 0;
//        }
//    }

//    public int findMod(String A, int B) {
//        int res=0;
//        long dig_b=1;
//        for (int i = A.length()-1; i >=0 ; i--)
//        {
//            int val = A.charAt(i)-'0';
//            int temp1 = val%B;
//            long temp2 = dig_b%B;
//            int temp3 = temp1*(int)temp2;
//            int temp4 = temp3%B;
//            res+=temp4;
//            dig_b=(dig_b*10)%B;
//        }
//
//        return res%B;
//    }

//    public int solve(int[] A) {
//        A = Arrays.stream(A).sorted().toArray();
//
//        for (int i = 1; i < A.length; i++) {
//            if(A[i] - A[i-1] != 1)
//                return 0;
//        }
//        return 1;
//    }
//public int[][] solve(int[][] A) {
//
//    int N = A.length;
//    int[][] res = new int[N][N];
//    for (int i = 0; i < N; i++) {
//        for (int j = 0; j < N; j++) {
//                res[i][j]=A[i][j];
//        }
//    }
//    for (int i = 0; i < N; i++) {
//        for (int j = 0; j < N; j++) {
//            if(A[i][j]==0)
//            {
//                Arrays.fill(res[i], 0);
//                for (int k = 0; k < N; k++) {
//                    res[k][j]=0;
//                }
//                break;
//            }
//        }
//    }
//    return res;
//}

//    public int[] solve(int A, int[][] B, int C) {
//
//        int[] time = new int[A+1];
//        Arrays.fill(time,Integer.MAX_VALUE);
//
//        List<KeyValue<Integer, Integer>>[] g;
//
//
//        return time;
//    }
//
//        public List<int> solve(int A, List<List<int>> B, int C)
//        {
//            // List<KeyValuePair<int, int>>[] g = new List<KeyValuePair<int, int>>[A];
//            // g = Enumerable.Repeat(Enumerable.Empty<KeyValuePair<int, int>>().ToList(), A).ToArray();
//            // for (int i = 0; i < B.Count; i++)
//            // {
//            //     g[B[i][0]].Add(new KeyValuePair<int, int>(B[i][1], B[i][2]));
//            // }
//
//            List<List<KeyValuePair<int, int>>> g = new List<List<KeyValuePair<int, int>>>();
//            List<KeyValuePair<int, int>> gg = new List<KeyValuePair<int, int>>();
//
//            gg.Add(new KeyValuePair<int, int>(-1, -1));
//
//            for (int i = 0; i < A; i++)
//            {
//                g.Add(gg);
//            }
//
//            List<int> time = new List<int>();
//            time = Enumerable.Repeat(int.MaxValue, A).ToList();
//            time[C] = 0;
//
//            SortedDictionary<int, int> d = new SortedDictionary<int, int>();
//
//            d.Add(0, C);
//
//            while (d.Count > 0)
//            {
//                var first = d.FirstOrDefault();
//                int t_val = first.Value;
//                int fromnode = first.Key;
//                d.Remove(first.Key);
//
//                if (t_val > time[fromnode])
//                {
//                    continue;
//                }
//                else
//                {
//                    for (int i = 0; i < g[fromnode].Count(); i++)
//                    {
//                        KeyValuePair<int, int> temp = new KeyValuePair<int, int>();
//                        temp = g[fromnode][i];
//                        int tonode = temp.Key, weight = temp.Value;
//                        if (time[tonode] > time[fromnode] + weight)
//                        {
//                            time[tonode] = time[fromnode] + weight;
//                            d.Add(time[tonode], tonode);
//                        }
//                    }
//                }
//            }
//            return time;
//        }



//    public int[] solve(final int[] A, final int[] B) {
//        int A_len=A.length;
//        int B_len=B.length;
//
//        int N = A_len+B_len;
//
//        int[] res = new int[N];
//        int i=0,j=0,k=0;
//        while(i<A_len && j<B_len)
//        {
//            if(A[i]<B[j])
//            {
//                res[k]=A[i];
//                i++;
//                k++;
//            }
//            else if(A[i]==B[j])
//            {
//                res[k]=A[i];
//                i++;
//                k++;
//                res[k]=B[j];
//                j++;
//                k++;
//            }
//            else
//            {
//                res[k]=B[j];
//                j++;
//                k++;
//            }
//        }
//        if(i<A_len)
//        {
//            for (int l = i; l < A_len; l++,k++) {
//                res[k]=A[l];
//            }
//        }
//        if(j<B_len)
//        {
//            for (int l = j; l < B_len; l++,k++) {
//                res[k]=B[l];
//            }
//        }
//
//        return res;
//
//    }
    // Generate Matrix in Spiral
//    public int[][] generateMatrix(int A) {
//        int[][] res = new int[A][A];
//        int i=0,j=0;
//        //int N = A*A;
//        int val=1;
//        while(A>1)
//        {
//            for (int k = 0; k < A; k++) {
//                res[i][j]=val;
//                j++;
//                val++;
//            }
//            for (int k = 0; k < A; k++) {
//                res[i][j]=val;
//                i++;
//                val++;
//            }
//            for (int k = 0; k < A; k++) {
//                res[i][j]=val;
//                j--;
//                val++;
//            }
//            for (int k = 0; k < A; k++) {
//                res[i][j]=val;
//                i--;
//                val++;
//            }
//            i++;j++;A=A-2;
//        }
//        if(A==1)
//        {
//            res[i][j]=val;
//
//        }
//        return res;
//    }


//    Special triplet(A[i]<A[j]<A[k] & B[i]+B[j]+B[k] is minimum)
//    public int solve(int[] A, int[] B) {
//        int ans = Integer.MAX_VALUE;
//        int N = A.length;
//        for (int j = 1; j < N-1; j++) {
//            int temp_sum = B[j];
//            int val_i = Integer.MAX_VALUE;
//            int val_k = Integer.MAX_VALUE;
//            for (int i = 0; i < j; i++) {
//                if(A[i]<A[j] && B[i]<val_i)
//                {
//                    val_i=B[i];
//                }
//            }
    // j = 1 -> i: 0- 1 : 1 iter
    // j = 2 -> i: 0- 2 : 2 iter
    // j = 3 -> i: 0- 3 : 3 iter
    // j = 4 -> i: 0- 4 : 4 iter
 //
//            for (int k = j+1; k < N; k++) {
//
//                if(A[k]>A[j] && B[k]<val_k)
//                {
//                    val_k=B[k];
//                }
//            }
//            if(val_k!=Integer.MAX_VALUE && val_i!=Integer.MAX_VALUE)
//            {
//                temp_sum = temp_sum+val_k+val_i;
//
//                ans = Math.min(ans,temp_sum);
//            }
//        }
//        if(ans==Integer.MAX_VALUE)
//        {
//            return -1;
//        }
//        return  ans;
//    }


}
