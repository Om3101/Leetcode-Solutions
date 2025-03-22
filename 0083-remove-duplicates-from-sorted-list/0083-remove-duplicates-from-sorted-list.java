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
    public ListNode deleteDuplicates(ListNode head)
    {
        HashSet<Integer> set = new HashSet<>();

        ListNode temp = head;
        ListNode current = null;
        ListNode prev = null;

        while(temp!=null)
        {
            if(!set.contains(temp.val))
            {
                ListNode newNode = new ListNode(temp.val);

                if(current == null)
                {
                    current = newNode;
                    prev = newNode;
                }
                else {
                    prev.next = newNode;
                    prev = newNode;
                }
                set.add(temp.val);
            }
            temp = temp.next;
        }
       return current;
    }
}