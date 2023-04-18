// package DataStructure.Linked List.LeetCodeQ;


//Middle of the linked list 
/*Here what we did we take two pointer slow and fast 
 * In the first they both point to head;
 * After each slow will point to next value while fast will point to next of next value means Twice of slow till it the fast reaches to end of the linkedlist
 * slow will be at the center of the linked list as per logic 
 * So will return the value of slow which means we will find the the middle of the linked list 
 */
public class LeetCode {
    public ListNode middleNode(ListNode head){

        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}


