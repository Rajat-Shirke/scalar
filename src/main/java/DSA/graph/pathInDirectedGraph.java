package DSA.graph;
import java.util.*;

public class pathInDirectedGraph {
    static int maxm = 200009;
    static int[] vis;
    static List<List<Integer>> adj;
//    public int solve(int A, List<List<Integer>> B) {
//        maxm = Integer.min(maxm,(A*(A-1)));
//        vis = new int[maxm];
//        adj = new ArrayList<>(maxm);
//        for (int i = 0; i < maxm; i++) {
//            vis[i]=0;
//            adj.add(new ArrayList<>());
//        }
//        for (List<Integer> integers : B) {
//            adj.get(integers.get(0)).add(integers.get(1));
//        }
//        DFS(0, A);
//        return vis[A];
//    }
//    void DFS(int s, int d)
//    {
//        vis[s] = 1;
//        if (vis[d]==1) {
//            return;
//        }
//        if(s==d) {
//            return;
//        }
//        for (int i = 0; i < adj.get(s).size(); i++)
//        {
//            int n = adj.get(s).get(i);
//            DFS(n, d);
//        }
//    }
    public static boolean dfs(int s, int x) {
        if (s == x)
            return true;
        vis[s] = 1;
        int i, j, k = adj.get(s).size();
        for (i = 0; i < k; i++) {
            j = adj.get(s).get(i);
            if (vis[j] == 0 && dfs(j, x))
                return true;
        }
        return false;
    }

    public int solve(int A, int[][] B) {
        maxm = Integer.min(maxm,(A*(A-1)+1));
        vis = new int[maxm];
        adj = new ArrayList<>(maxm);
        for (int i = 0; i < maxm; i++) {
            vis[i]=0;
            adj.add(new ArrayList<>());
        }
        for (int[] ints : B) {
            adj.get(ints[0]).add(ints[1]);
        }
        if(dfs(1, A)) {
            return 1;
        }
        else
            return 0;
        //return vis[A];
    }
}
