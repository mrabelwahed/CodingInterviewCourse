package LinkedList.cycle;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
      ListNode a = new ListNode(3);
      ListNode b = new ListNode(2);
      ListNode c = new ListNode(0);
      ListNode d = new ListNode(-4);

      a.next = b;
      b.next = c;
      c.next =d;
      d.next = b;

        System.out.println(hasCycle(a));
    }

     // solution1: using set
    // time O(n) , space O(n)
//       static public boolean hasCycle(ListNode head) {
//            if(head==null) return false;
//            if(head.next == null) return false;
//            Set<ListNode> set = new HashSet<ListNode>();
//            while(head.next!=null){
//                if(!set.contains(head))
//                    set.add(head);
//                else
//                    return true;
//                head =  head.next;
//            }
//            return false;
//    }

    // solution2 : using fast and slow pointers
    // time O(n) , space O(1)
    static public boolean hasCycle(ListNode head) {
        if(head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow.equals(fast))
                return true;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
