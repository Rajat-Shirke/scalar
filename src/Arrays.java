import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Arrays {

//        public int solve(ArrayList<ArrayList<Integer>> A, ArrayList<ArrayList<Integer>> B) {
//
//            int N = A.size();
//            int M = A.get(0).size();
//
//            for(int i=0;i<N;i++)
//            {
//                for (int j = 0; j < M; j++) {
//                    if(!Objects.equals(A.get(i).get(j), B.get(i).get(j)))
//                    {
//                        return 0;
//                    }
//                }
//            }
//            return 1;
//        }
//public int[] solve(int[][] A) {
//int N = A.length;
//int M = A[0].length;
//int[] res = new int[N];
//    for (int i = 0; i < N; i++) {
//        int sum=0;
//        for (int j = 0; j < M; j++) {
//            sum+=A[i][j];
//        }
//        res[i]=sum;
//    }
//return res;
//}
//    public List<int> solve(int A, List<List<int>> B, int C)
//    {
//        // List<KeyValuePair<int, int>>[] g = new List<KeyValuePair<int, int>>[A];
//        // g = Enumerable.Repeat(Enumerable.Empty<KeyValuePair<int, int>>().ToList(), A).ToArray();
//        // for (int i = 0; i < B.Count; i++)
//        // {
//        //     g[B[i][0]].Add(new KeyValuePair<int, int>(B[i][1], B[i][2]));
//        // }
//
//        List<List<KeyValuePair<int, int>>> g = new List<List<KeyValuePair<int, int>>>();
//        List<KeyValuePair<int, int>> gg = new List<KeyValuePair<int, int>>();
//
//        gg.Add(new KeyValuePair<int, int>(-1, -1));
//
//        for (int i = 0; i < A; i++)
//        {
//            g.Add(gg);
//        }
//
//        List<int> time = new List<int>();
//        time = Enumerable.Repeat(int.MaxValue, A).ToList();
//        time[C] = 0;
//
//        SortedDictionary<int, int> d = new SortedDictionary<int, int>();
//
//        d.Add(0, C);
//
//        while (d.Count > 0)
//        {
//            var first = d.FirstOrDefault();
//            int t_val = first.Value;
//            int fromnode = first.Key;
//            d.Remove(first.Key);
//
//            if (t_val > time[fromnode])
//            {
//                continue;
//            }
//            else
//            {
//                for (int i = 0; i < g[fromnode].Count(); i++)
//                {
//                    KeyValuePair<int, int> temp = new KeyValuePair<int, int>();
//                    temp = g[fromnode][i];
//                    int tonode = temp.Key, weight = temp.Value;
//                    if (time[tonode] > time[fromnode] + weight)
//                    {
//                        time[tonode] = time[fromnode] + weight;
//                        d.Add(time[tonode], tonode);
//                    }
//                }
//            }
//        }
//        return time;
//    }

    public int[] solve(int A, int[][] B, int C)
    {

        int[][] g = new int[B.length+1][B[0].length+1];

        int[] time = new int[A];
        java.util.Arrays.fill(time, Integer.MAX_VALUE);
        time[C]=0;

        return time;
    }

}


