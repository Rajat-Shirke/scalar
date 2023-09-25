import java.io.*;
import java.util.*;

public class wisetechGlobal1 {

    public static List<Integer> getStaleServerCount(int n, List<List<Integer>> log_data, List<Integer> query, int X) {
        // Write your code here
        int m = log_data.size();
        //HashMap<Integer,Integer> queries = new HashMap<>();

        HashMap<Integer, HashSet<Integer>> range = new HashMap<>();
        for (Integer integer : query) {
            //queries.put(integer, 0);
            range.put(integer, new HashSet<>());
        }
        for(int i=0;i< m;i++)
        {
            int server = log_data.get(i).get(0);
            int time = log_data.get(i).get(1);
            for (int q : query) {
                if (time >= (q - X) && time <= (q)) {

                    //queries.put(q, queries.get(q) + 1);
                    HashSet<Integer> temp = range.get(q);
                    temp.add(server);
                    range.put(q,temp);
                }
            }
        }
        List<Integer> res = new ArrayList<>();
        for (Integer integer : query) {
            res.add(n - range.get(integer).size());
        }
        return res;
    }
    public static List<Integer> getTimes(List<Integer> time, List<Integer> direction) {

        int N = time.size();
        int max_time = time.get(time.size()-1);
        HashMap<Integer,Integer> passingPerson = new HashMap<>();
        for (int i = 0; i < N; i++) {
            passingPerson.put(i,time.get(i));
        }
        HashMap<Integer,Integer> aravingTime = new HashMap<>();
        for (int i = 0; i <= max_time+1; i++) {
            aravingTime.put(i,-1);
        }
//        for (int i = 0; i < N; i++) {
//            int ithTimeVal = time.get(i);
//            List<Integer> temp = aravingTime.get(ithTimeVal);
//            temp.add(i+1);
//            aravingTime.put(ithTimeVal,temp);
//        }
        Queue<AbstractMap.SimpleEntry<Integer,Integer>> entryQueue = new PriorityQueue<>();
        Queue<AbstractMap.SimpleEntry<Integer,Integer>> exitQueue = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            if(direction.get(i)==0)
                entryQueue.add(new AbstractMap.SimpleEntry<>(i,time.get(i)));
            else
                exitQueue.add(new AbstractMap.SimpleEntry<>(i,time.get(i)));
        }
        int queuesize = Integer.max(entryQueue.size(),exitQueue.size());
        for (int i = 0; i < queuesize; i++) {

            AbstractMap.SimpleEntry<Integer,Integer> entryPerson=new AbstractMap.SimpleEntry<>(null);
            AbstractMap.SimpleEntry<Integer,Integer> exitPerson=new AbstractMap.SimpleEntry<>(null);
            if(!entryQueue.isEmpty())
            {
                entryPerson = entryQueue.peek();
            }
            if(!exitQueue.isEmpty())
            {
                exitPerson = exitQueue.peek();
            }
            if(Objects.equals(entryPerson.getValue(), exitPerson.getValue()))
            {
                //time at gate
                int prevTimeVal = aravingTime.get(entryPerson.getValue()-1);
                switch (prevTimeVal)
                {
                    case -1:


                        break;
                    case 0:
                        break;
                    case 1:
                        break;
                    default:

                        break;

                }

            }

        }



        //result
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < passingPerson.size(); i++) {
            result.add(passingPerson.get(i+1));
        }
        return result;
    }


}
