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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         ListNode root = new ListNode(), curr = root;
        ListNode index1=list1, index2=list2;
        while(index1!=null && index2!=null){
            if(index1.val<index2.val){
                curr.next=index1; curr=index1; index1=index1.next;
            }else { curr.next=index2; curr=index2; index2=index2.next;}
        }
        while(index1!=null) 
        { curr.next=index1; curr=index1; index1=index1.next; }
        while(index2!=null)
        { curr.next=index2; curr=index2; index2=index2.next;}
        return root.next;
    }
}