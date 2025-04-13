// package DataStructure.Linked List.LeetCodeQ;


//Middle of the linked list 
// Link->  https://leetcode.com/problems/middle-of-the-linked-list/
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
// }

/*
 * Followed up questio Deleter the middle of the Node
 * Link -> 
 */

 public ListNode deleteMiddle(ListNode head) {
        
        if(head.next == null){
            return null;
        }    
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }

        slow.next = slow.next.next;
        return head;

 }

 //There can be many follow up quesition 
 //detect a loop
 //find the where the loop started
 //happy number
 //palindrome nubmer
 




