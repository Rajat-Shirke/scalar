package DSA.graph;
import java.util.*;

public class depthFirstSearch {
    static int maxn = 100009;
    static int[] vis = new int[maxn];
    static List <List<Integer> > adj;
    public static void graph() {
        adj = new ArrayList<>(maxn);
        for (int i = 0; i < maxn; i++) {
            vis[i] = 0;
            adj.add(new ArrayList<>());
        }
    }
    public int solve(List<Integer> A, int B, int C) {
        graph();
        int n = A.size();
        for (int i = 1; i < n; i++) {
            adj.get(A.get(i)).add(i + 1);
        }
        if (dfs(C, B))
            return 1;
        return 0;
    }
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
}
