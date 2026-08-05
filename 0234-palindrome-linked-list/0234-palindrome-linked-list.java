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
    public boolean isPalindrome(ListNode head) {
        ListNode c=head;
        int count=0;
        while(c!=null){
            count++;
            c=c.next;
        }
        int[] arr=new int[count];
        int i=0;
        while(head!=null){
            arr[i]=head.val;
            head=head.next;
            i++;
        }
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            if(arr[low]!=arr[high]){
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}