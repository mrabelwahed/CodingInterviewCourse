package LinkedList.add;

public class LC2Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        int carry=0;
        while(l1!=null && l2!=null){
            int data = l1.val + l2.val +carry;
            dummy.next = new ListNode(data%10);
            carry = data/10;
            dummy = dummy.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while(l1==null && l2 !=null){
            int data = l2.val+carry;
            dummy.next = new ListNode(data%10);
            carry = data/10;
            dummy = dummy.next;
            l2 = l2.next;
        }

        while(l2==null && l1 !=null){
            int data = l1.val+carry;
            dummy.next = new ListNode(data%10);
            carry = data/10;
            dummy = dummy.next;
            l1 = l1.next;
        }

        if(carry>0)
            dummy.next = new ListNode(carry);
        return head.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }




}
