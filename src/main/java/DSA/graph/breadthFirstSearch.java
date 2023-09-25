package DSA.graph;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class breadthFirstSearch {
    static int maxn = 100009;
    static int[] vis = new int[maxn];
    static int[] lvl = new int[maxn];
    static int[] parent = new int[maxn];
    static List <List<Integer>> adj;
    public static void graph() {
        adj = new ArrayList<>(maxn);
        //For Directed Graph
        for (int i = 0; i < maxn; i++) {
            vis[i] = 0;
            lvl[i]=-1;
            parent[i]=-1;
            adj.add(new ArrayList<>());
        }
    }

    public int solve( List<List<Integer>> A,int B,int C)
    {
        graph();
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(B);
        vis[B]=1;
        lvl[B]=0;
        parent[B]=B;
        while (!queue.isEmpty())
        {
            int src = queue.peek();
            queue.remove();

            vis[src]=1;
            for (int i = 0; i < adj.get(src).size(); i++) {
                int temp = adj.get(src).get(i);
                if(vis[temp]==0)
                {
                    queue.add(temp);
                    vis[temp]=1;
                    lvl[temp]=lvl[src]+1;
                    parent[temp]=src;
                }
            }
        }
        return vis[C];
    }
}
