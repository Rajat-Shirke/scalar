package DSA.graph;

import java.util.*;

public class rottenOrranges {
/*Given a matrix of integers A of size N x M consisting of 0, 1 or 2.
    Each cell can have three values:
    The value 0 representing an empty cell.
    The value 1 representing a fresh orange.
    The value 2 representing a rotten orange.
    Every minute, any fresh orange that is adjacent (Left, Right, Top, or Bottom) to a rotten orange becomes rotten.
    Return the minimum number of minutes that must elapse until no cell has a fresh orange. If this is impossible, return -1 instead.

    Sample Input :
    A = [ [2, 1, 1] [1, 1, 0] [0, 1, 1] ]
    Expected Output : 4
 */
    public int solve(int[][] A) {
        int rows = A.length, columns = A[0].length,maxTimetoRott=0;
        int[][] timetoRott = new int[rows][columns];
        //BFS Approach
        //Queue<AbstractMap.SimpleEntry<Integer,Integer>> q = new PriorityQueue<>(Comparator.comparingInt(AbstractMap.SimpleEntry::getKey));
        Queue<AbstractMap.SimpleEntry<Integer,Integer>> q = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (A[i][j]==2) {
                    q.add(new AbstractMap.SimpleEntry<>(i, j));
                    timetoRott[i][j] = 0;
                }
                else
                    timetoRott[i][j] = -1;
            }
        }
        while (!q.isEmpty()) {
            int i= q.peek().getKey(), j = q.peek().getValue();
            q.remove();
            if (j-1>=0&&A[i][j-1]==1) {
                timetoRott[i][j-1]=timetoRott[i][j]+1;
                A[i][j-1]=2;
                q.add(new AbstractMap.SimpleEntry<>(i,j-1));
                maxTimetoRott=Integer.max(maxTimetoRott,timetoRott[i][j]+1);
            }
            if (j+1<columns&&A[i][j+1]==1) {
                timetoRott[i][j+1]=timetoRott[i][j]+1;
                A[i][j+1]=2;
                q.add(new AbstractMap.SimpleEntry<>(i,j+1));
                maxTimetoRott=Integer.max(maxTimetoRott,timetoRott[i][j]+1);
            }
            if (i-1>=0&&A[i-1][j]==1) {
                timetoRott[i-1][j]=timetoRott[i][j]+1;
                A[i-1][j]=2;
                q.add(new AbstractMap.SimpleEntry<>(i-1,j));
                maxTimetoRott=Integer.max(maxTimetoRott,timetoRott[i][j]+1);
            }
            if (i+1<rows&&A[i+1][j]==1) {
                timetoRott[i+1][j]=timetoRott[i][j]+1;
                A[i+1][j]=2;
                q.add(new AbstractMap.SimpleEntry<>(i+1,j));
                maxTimetoRott=Integer.max(maxTimetoRott,timetoRott[i][j]+1);
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (A[i][j]==1) {
                    return -1;
                }
            }
        }
        return maxTimetoRott;
    }

}
