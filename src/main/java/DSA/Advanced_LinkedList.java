package DSA;

import DSA.linkedList.ListNode;

public class Advanced_LinkedList {
    public int solve(ListNode A) {
        int count = size(A);
        int ind=0,element=0;
        if (count%2==0)
            ind=count/2+1;
        else 
            ind=count/2;
        for (int i = 0; i < ind; i++) {
            A=A.next;
        }
        return A.val;


    }
    int size(ListNode h)
    {
        int c=0;
        while(h!=null)
        {
            c++;
            h=h.next;
        }
        return c;
    }
}

