package DSA.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
//        pathInDirectedGraph ob = new pathInDirectedGraph();
////        int[] inputArr=new int[]{8, 12, 16, 4, 0, 20};
////        int valToCheck = 4;
//        int[][] inputArr=new int[][]{{1,3},{2,3},{3,2}};
//        //int[][] inputArr=new int[][]{{1,4},{2,1},{4,3},{4,5},{2,3},{2,4},{1,5},{5,3},{2,5},{5,1},{4,2},{3,1},{5,4},{3,4},{1,3},{4,1},{3,5},{3,2},{5,2}};
//        int valToCheck = 3;
//        int ans = ob.solve(valToCheck,inputArr);

//        orderManagementSystem o = new orderManagementSystem();
//        List<Integer> cityFrom = new ArrayList<>();
//        List<Integer> cityTo = new ArrayList<>();
//        cityFrom.add(1);
////        cityFrom.add(1);
////        cityFrom.add(1);
////        cityFrom.add(2);
////        cityFrom.add(3);
//
//        cityTo.add(2);
////        cityTo.add(5);
////        cityTo.add(3);
////        cityTo.add(4);
////        cityTo.add(5);
//
//        orderManagementSystem.order(2,cityFrom,cityTo,2);

        minCosttoReachAllIsland a = new minCosttoReachAllIsland();
        int[][] inp = new int[][]{{1,2,3},{2,3,4},{3,4,5},{4,5,6},{5,1,2},{2,4,3},{2,5,5},{1,3,2}};
        int ans = a.solve(5,inp);

//        rottenOrranges r = new rottenOrranges();
//        int[][] inp = new int[][]{{2,0,2,2,2,0,2,1,1,0},{0,1,2,0,2,0,0,1,0,1},{0,1,1,1,2,0,1,1,2,1},{2,0,2,0,1,1,2,1,0,1},{1,0,1,1,0,1,2,0,2,2},{0,2,1,1,2,2,0,2,1,2},{2,1,0,2,0,0,0,0,1,1},{2,2,0,2,2,1,1,1,2,2}};
//        int val = r.solve(inp);

        int dummy = -1;
    }
}
