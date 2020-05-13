package LinkedList.reverse;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode ln = new ListNode(1);
        ln.next = new ListNode(2);
        ln.next.next = new ListNode(3);
        ln.next.next.next = new ListNode(4);
        ln.next.next.next.next = null;

       ListNode res =  reverseList(ln);
       printList(res);
    }

    static  public ListNode reverseList(ListNode head) {
        if (head == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        //traverse ll
        while (curr != null) {
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }

    static public  void printList(ListNode head){
        while(head.next!=null){
            System.out.print(head.val +"->");
            head = head.next;
        }
        System.out.print(head.val +"->");
        System.out.print("NULL");
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
