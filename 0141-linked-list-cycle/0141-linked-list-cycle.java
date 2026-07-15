/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                return true;
            }
        }
        return false;
        // Using extra Space 

        // HashSet<ListNode> s=new HashSet<>();
        // while(head!=null){
        //     if(s.contains(head)==true) return true;
        //     s.add(head);
        //     head=head.next;
        // }
        // return false;
    }
}