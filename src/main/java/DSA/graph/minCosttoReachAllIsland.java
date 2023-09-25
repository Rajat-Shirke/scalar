package DSA.graph;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class minCosttoReachAllIsland {

    static int maxm = 600009;
    static List<List<AbstractMap.SimpleEntry<Integer,Integer>>> adj;
    HashMap<Integer, AbstractMap.SimpleEntry<Integer,Integer>> visitNodeDist;
    public int solve(int A, int[][] B) {
        maxm = Integer.min(maxm,(A*(A-1)+1));
        adj=new ArrayList<>(maxm);
        visitNodeDist = new HashMap<>(maxm);
        AtomicInteger MinDistanceToTravell= new AtomicInteger();
        for (int i = 0; i < maxm; i++) {
            adj.add(new ArrayList<>());
        }

        //Starting Island = B[0][0] - any node can be considered
        visitNodeDist.put(B[0][0],new AbstractMap.SimpleEntry<>(0,0));
        for (int i = 0; i < B.length; i++) {
            adj.get(B[i][0]).add(new AbstractMap.SimpleEntry<>(B[i][1],B[i][2]));
            //int minDistance = Integer.min(visitNodeDist.get(B[i][1]),B[i][2]);
            visitNodeDist.put(B[i][1],new AbstractMap.SimpleEntry<>(B[i][2],B[i][2]));
        }
        for (int i=0;i<adj.size();i++) {
            int srcTotCost=0,srcCost=0;
            if(visitNodeDist.containsKey(i))
            {
                srcCost=visitNodeDist.get(i).getKey();
                srcTotCost=visitNodeDist.get(i).getValue();
            }

            for (int j = 0; j < adj.get(i).size(); j++) {
                int dest=adj.get(i).get(j).getKey();
                int destCost = adj.get(i).get(j).getValue();
                int destTotCost = srcTotCost+destCost;
                int destPrevTotCost = visitNodeDist.get(dest).getValue();
                int destPrevCost = visitNodeDist.get(dest).getKey();
                if(destTotCost<destPrevTotCost)
                {
                    visitNodeDist.put(dest,new AbstractMap.SimpleEntry<>(destCost,destTotCost));
                } else if (srcTotCost==destPrevTotCost) {
                    visitNodeDist.put(dest,new AbstractMap.SimpleEntry<>(Integer.min(destPrevCost,destCost),srcTotCost+Integer.min(destPrevCost,destCost)));
                }
            }
        }

        visitNodeDist.forEach((k,v)-> MinDistanceToTravell.addAndGet(v.getKey()));

        return MinDistanceToTravell.get();
    }
}
