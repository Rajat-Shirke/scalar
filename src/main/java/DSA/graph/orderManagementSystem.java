package DSA.graph;
import java.util.*;

public class orderManagementSystem {

    static int maxn = 100009;
    static int[] vis;
    //static HashMap<Integer,Integer> lvl;
    //static SortedMap<Integer,Integer> lvl;
    static List <List<Integer>> lvl;
    static int[] lvlKey;
    static List <List<Integer>> adj;
    public static void graph() {
        vis = new int[maxn];
        lvlKey = new int[maxn];
        lvl = new ArrayList<>(maxn);
        adj = new ArrayList<>(maxn);
        //For Directed Graph
        for (int i = 0; i < maxn; i++) {
            vis[i] = 0;
            lvlKey[i]=-1;
            lvl.add(new ArrayList<>());
            adj.add(new ArrayList<>());
        }
    }
    public static List<Integer> order(int cityNodes, List<Integer> cityFrom, List<Integer> cityTo, int company)
    {
        maxn = Integer.min((cityNodes*(cityNodes-1))+1,maxn);
        graph();
        int N = cityFrom.size();
        for (int i = 0; i < N; i++) {
            int cityfrom = cityFrom.get(i);
            int cityto = cityTo.get(i);
            adj.get(cityfrom).add(cityto);
            adj.get(cityto).add(cityfrom);
        }
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(company);
        vis[company]=1;
        lvlKey[company]=0;
        lvl.get(0).add(company);
        Map.Entry<Integer, String>[] entryArray
                = adj.toArray(new Map.Entry[adj.size()]);

        List<Integer> orderToCity = new ArrayList<>(N);
        while (!queue.isEmpty())
        {
            int src = queue.peek();
            queue.remove();
            vis[src]=1;
            List<Integer> srcAdj = adj.get(src);
            Collections.sort(srcAdj);
            for (int i = 0; i < srcAdj.size(); i++) {
                int temp = srcAdj.get(i);
                if(vis[temp]==0)
                {
                    queue.add(temp);
                    vis[temp]=1;
                    lvlKey[temp]=lvlKey[src]+1;
                    lvl.get(lvlKey[temp]).add(temp);
                    orderToCity.add(temp);
                }
            }
        }
        for (int i = 1; i < lvl.size(); i++) {
            Collections.sort(lvl.get(i));
            for (int j = 0; j < lvl.get(i).size(); j++) {
                orderToCity.add(lvl.get(i).get(j));
            }

        }
        return orderToCity;
    }

}
