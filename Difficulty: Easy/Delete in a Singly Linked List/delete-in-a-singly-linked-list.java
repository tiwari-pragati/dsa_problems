/* Linklist node structure
class Node
{
    int data;
    Node next;

    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    Node deleteNode(Node head, int x) {
      
      if(head == null) return head;
      if(x == 1){  // at head
          Node temp = head;
          head = head.next;
          return head;
      }
      // when we have x > 1
      if(x > 1){
          int cnt = 0;
          Node temp = head;
          Node prev = null;
          while(temp != null){
              cnt ++;
              if(cnt == x){
                  prev.next = prev.next.next;
                  break;
              }
              prev = temp;
              temp = temp.next;
          }
         
      }
       return head;
    }
}