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
        ListNode curr=head;
        int count=0;
        while(curr!=null){
            curr=curr.next;
            count++;
        }
        int i=count-n-1;
        if(count==n){
            return head.next;
        }
        ListNode curr2=head;
        int l=0;
        while(curr2!=null){
            if(l==i){
                curr2.next=curr2.next.next;
            }
            else{
            curr2=curr2.next;
           
        }
         l++;
        }
        return head;
    }
}