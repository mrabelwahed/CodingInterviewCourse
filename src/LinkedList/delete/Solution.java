package LinkedList.delete;



class Solution {

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode b = new ListNode(2);
        ListNode c = new ListNode(3);

        a.next = b;
        b.next = c;

        deleteNode(b);
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

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }


   static public void deleteNode(ListNode node) {
        if(node !=null){
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }
}
