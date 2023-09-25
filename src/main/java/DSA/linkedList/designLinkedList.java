package DSA.linkedList;
public class designLinkedList {

    static ListNode head=null;
    static int count=0;
    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        if (position >= 1 && position <= count + 1) {
            ListNode newnode = new ListNode(value);
            if (position == 1) {
                newnode.next = head;
                head = newnode;
            } else {
                ListNode temp = head;
                for (int i = 1; i < position - 1; i++) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
            count++;
        }
    }
    public static void delete_node(int position) {
        // @params position, integer
        if(position>=1&&position<=count) {
            if (position == 1) {
                head = head.next;
            } else {
                ListNode temp = head;
                for (int i = 1; i < position - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
            count--;
        }
    }
    public static void print_ll() {
        // Output each element followed by a space
        ListNode temp = head;
        while (temp.next != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.print(temp.val);
    }
}
