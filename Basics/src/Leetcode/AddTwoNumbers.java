package Leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class AddTwoNumbers {
    public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode curr = dummyHead;
        ListNode p = l1;
        ListNode q = l2;
        int carry = 0;
        while(p!=null || q !=null){
            int x = p != null ? p.val : 0;
            int y = q != null ? q.val : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            p = p.next;
            q = q. next;
        }
        if(carry > 0){
            curr.next = new ListNode( carry);
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(3);
        ListNode q1 = l1;
        ListNode p1 = new ListNode(4);
        q1.next = p1;
        q1=p1;
        p1 = new ListNode(3);
        q1.next = p1;
        q1=p1;

        ListNode l2 = new ListNode(5);
        ListNode q2 = l2;
        ListNode p2 = new ListNode(6);
        q2.next = p2;
        q2=p2;
        p2 = new ListNode(7);
        q2.next = p2;
        q2=p2;

        ListNode f=addTwoNumbers(l1,l2);
    }
}
