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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode ans=new ListNode();
        ListNode head3=ans;
        int carry=0;
        while(head1!=null && head2!=null){
            int num=carry+head1.val+head2.val;
            if(num>9){
                carry=num/10;
                num=num%10;  
            }
            else carry=0;
            head3.next=new ListNode(num);
            head3=head3.next;
            head1=head1.next;
            head2=head2.next;

        }
        while(head1!=null){
            int num=carry+head1.val;
            if(num>9){
                 carry=num/10;
                num=num%10;
               
            }
            else{
                carry=0;
            }
            head3.next=new ListNode(num);
            head3=head3.next;
            head1=head1.next;
        }
        while(head2!=null){
            int num=carry+head2.val;
            if(num>9){
                carry=num/10;
                num=num%10;
            }
            else{
                carry=0;
            }
            head3.next=new ListNode(num);
            head3=head3.next;
            head2=head2.next;
        }
        if(carry>0){
            head3.next=new ListNode(carry);
        }
        return ans.next;
    }
}