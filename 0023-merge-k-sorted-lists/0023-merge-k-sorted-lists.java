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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        // create an array
        List<Integer> values = new ArrayList<>();

        // add all the values to the array
        for(ListNode list : lists)
        {
            while(list!=null) {
                values.add(list.val);
                list = list.next;
            }
        }

        //sort the array
        Collections.sort(values);

        //convert back to list
        ListNode temp = new ListNode();
        ListNode current = temp;

        for(int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }

        return temp.next;
    }
}