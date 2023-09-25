package DSA.stacks;

import java.util.Stack;

public class nearestSmallerElement {
    public int[] prevSmaller(int[] A) {
        int arraySize = A.length;
        int[] res = new int[arraySize];

        Stack<Integer> stack = new Stack<>();
        res[0]=-1;
        stack.push(A[0]);
        for (int i = 1; i < arraySize; i++) {//
                while (!stack.empty()&&A[i] <= stack.peek()) {
                    stack.pop();
                }
                if(!stack.empty())
                    res[i]=stack.peek();
                else
                    res[i]=-1;

                stack.push(A[i]);
        }
        return res;
    }
}

