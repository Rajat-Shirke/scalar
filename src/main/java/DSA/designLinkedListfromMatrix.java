package DSA;

import DSA.linkedList.ListNode;

public class designLinkedListfromMatrix {

static ListNode head=null;
static int count=0;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        ListNode newnode = new ListNode(value);
        if(head ==null)
        {
            head=newnode;
            count++;
            //print
            System.out.println(newnode.val+" added at 1 and count "+Integer.toString(count));
            return;
        }

        ListNode temp = head;
        int i=1;
        while(temp.next!=null &&i<position-1)
        {
            temp = temp.next;
            i++;
        }
        if(temp.next==null) {
            temp.next = newnode;
            count++;
        }
        else
        {
            newnode.next=temp.next;
            temp.next=newnode;
            count++;
        }
        //print
        System.out.println(newnode.val+" added at "+(i+1)+" and count "+Integer.toString(count));
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position>count||position<=0){
            //print
            System.out.println(" delete is not possible at "+position+" count "+count);
            return;
        }

        ListNode temp = head;
        ListNode prev = head;
        int i=1;
        while(temp.next!=null &&i<position)
        {
            prev=temp;
            temp = temp.next;
            i++;
        }
        if(temp.next==null) {
            prev.next = null;
            count--;
        }
        else
        {
            prev.next=temp.next;
            count--;
        }
        //print
        System.out.println("deleted at "+position+" count "+count);
    }

    public static void print_ll() {
        // Output each element followed by a space

        int c=0;
        ListNode temp = head;
        while(temp!=null)
        {
            if(c==count)
            {
                System.out.println(temp.val);
                return;
            }
            System.out.print(temp.val+" ");
            temp=temp.next;
            //c++;
        }
    }

//    public static void print_ll() {
//        // Output each element followed by a space
//
//        int c=0;
//        ListNode temp = head;
//        while(temp!=null||temp.next!=null)
//        {
//            if(c==count)
//            {
//                System.out.println(temp.val);
//                return;
//            }
//            System.out.println(temp.val+" ");
//            temp=temp.next;
//        }
//    }

    public ListNode solve(int[][] A) {
        int N = A.length;

        ListNode head= null;
        ListNode prev = null;
        ListNode temp ;
        int count=0;

        for (int i = 0; i < N; i++) {
            if (A[i][0] == 0) {
                temp = head;
                head = new ListNode(A[i][1]);
                head.next = temp;
                count++;
            }
            else if (A[i][0] == 1) {

                if(head==null)
                {
                    head= new ListNode(A[i][1]);
                    count++;
                    continue;
                }
                temp = head;
                while (temp.next !=null) {
                    temp = temp.next;
                }
                temp.next = new ListNode(A[i][1]);
                count++;
            }
            else if (A[i][0] == 2) {
                temp = head;
                if(A[i][2]>count)
                {
                    continue;
                }
                if(A[i][2]==0)
                {
                    head = new ListNode(A[i][1]);
                    head.next = temp;
                    count++;
                    continue;
                }
                for (int j = 0; j < A[i][2]-1; j++) {
                    if (temp.next == null) {
                        break;
                    } else {
                        temp = temp.next;
                    }
                }
                if(A[i][2]==count-1&&temp.next==null) {
                    temp=temp.next;
                }
                ListNode newnode = new ListNode(A[i][1]);
                if(temp==null){
                    head=newnode;
                }
                else {
                    newnode.next=temp.next;
                    temp.next = newnode;
                }
                count++;
            }
            else if (A[i][0] == 3) {
                if(head == null)
                {
                    continue;
                }
                temp = head;
                prev = head;
                if(count<A[i][1])
                {
                    continue;
                }
                if(A[i][1]==0)
                {
                    head=head.next;
                    count--;

                }
                else {
                    boolean isvalid = true;
                    for (int j = 0; j < A[i][1]; j++) {
                        if (temp.next == null) {
                            isvalid = false;
                            break;
                        } else {
                            prev = temp;
                            temp = temp.next;
                        }
                    }
                    if (isvalid) {

                        prev.next = temp.next;
                        count--;
                    }
                }
            }
        }
        return head;

    }

}
