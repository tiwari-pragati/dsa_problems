/* Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/

class Solution {
    int getMiddle(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
        // Not a One Pass Solution
        // int length = 0;
        // Node temp = head;
        // while(temp != null){
        //     temp = temp.next;
        //     length ++;
        // }
        // temp = head;
        // for(int i = 1; i <= length/2; i ++){
        //     temp = temp.next;
        // }
        // return temp.data;
    }
}