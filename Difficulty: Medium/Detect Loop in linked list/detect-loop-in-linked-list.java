/* Node is defined as
class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
} */

class Solution {
    // Function to check if the linked list has a loop.
    public static boolean detectLoop(Node head) {
       Node slow = head;
       Node fast = head;
       while(fast != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;
           if(fast == slow) return true;
       }
       return false;
    }
}