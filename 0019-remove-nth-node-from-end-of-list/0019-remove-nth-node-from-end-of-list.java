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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        ListNode curr=dummy;
        ListNode slow=dummy;
        ListNode fast=dummy;
        int l=0;
        while(fast!=null){
            if(l==n+1){
                break;
            }
            fast=fast.next;
            l++;
        }
        while(fast!=null){
                slow=slow.next;
                fast=fast.next;
        }
        slow.next=slow.next.next;
        return curr.next;
    }
}