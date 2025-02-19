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
class Solution
{
    //inserting at end
    static ListNode insertAtEnd(ListNode head, int k)
    {
        ListNode newNode = new ListNode(k);

        if(head == null) {
            head = newNode;
            return head;
        }

        ListNode temp = head; 

        while(temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        
        return head;
    }

    //rotating list by k
    public ListNode rotateRight(ListNode head, int k)
    {
        if(head == null||head.next == null||k == 0) return head;

        ListNode temp = head;
        int length = 1;

        while(temp.next!=null)
        {
            length++;
            temp = temp.next;
        }

        //link last to first
        temp.next = head;
        k = k % length;  // k > length

        int end = length - k;
        
        while(end-- != 0) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;

        return head;
    }
}