package Hackerrank;

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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // get the larger size of the list, will be used as the iteration times for our loop
        int smLen;
        int lgLen;

        // two pointers p1 to loop through l1, p2 to loop through l2
        ListNode smP;
        ListNode lgP;
        if(l1.size()>=l2.size()){
            lgLen = l1.szie();
            lgP = l1;
            smLen = l2.szie();
            smP = l2;
        }else{
            lgLen = l2.siz2();
            lgP = l2;
            smLen = l1.szie();
            smP = l1;
        }

        // int carry
        int carry = 0;
        int sum = 0;

        // l to store the final sum
        ListNode l = new LsitNode();
        sum = smP.val + lgP.val;
        if(sum<10){
            l.val = sum;
            carry = 0;
        }else{
            l.val = sum % 10;
            carry = 1;
        }
        for(int i=1;i<lgLen;i++ ){
            if(i<smLen){
                sum = smP.val+lgP.val+carry;
            }else{
                sum = lgP.val+carry;
            }

            if(sum<10){
                l.next = new ListNode(sum, l);
                carry = 0;
            }else{
                l.next = new ListNode(sum % 10, l);
                carry = 1;
            }

        }

    }
}
