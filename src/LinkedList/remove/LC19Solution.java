package LinkedList.remove;



public class LC19Solution {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);
        ListNode d = new ListNode(4);
        ListNode e = new ListNode(5);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;

        removeNthFromEnd(a,2);
        printList(a);

    }

    static public  void printList(ListNode head){
        while(head.next!=null){
            System.out.print(head.val +"->");
            head = head.next;
        }
        System.out.print(head.val +"->");
        System.out.print("NULL");
    }

    static public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null|| head.next == null) return null;
        ListNode fast=head;
        ListNode slow = head;
        int i=0;
        while(i<n){
            fast = fast.next;
            i++;
        }

        if(fast== null){
            return head.next;
        }


        while(fast.next!=null){
            fast = fast.next;
            slow = slow.next;
        }


        slow.next = slow.next.next;
        return head;


    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
