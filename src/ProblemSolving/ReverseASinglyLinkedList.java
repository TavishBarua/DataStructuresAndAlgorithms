package ProblemSolving;

import java.util.Stack;

 class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class ReverseASinglyLinkedList {


     public ListNode reverseList(ListNode head) {
         if (head == null) {
             return null;
         }

         ListNode node = head,
                 prev = null,
                 reversed = null;

         while (node != null) {
             final ListNode next = node.next;

             if (node.next == null) {
                 reversed = node;
             }
             node.next = prev;
             prev = node;
             node = next;
         }

         return reversed;
//     ListNode node = null;
//         ListNode temp = null;
//         Stack<ListNode> stack  = new Stack<>();
//         while(head!=null){
//             stack.push(head);
//             head = head.next;
//         }
//         while(!stack.empty()){
//             if(node==null){
//                 node = stack.pop();
//                 temp = node;
//             }
//             else {
//                 node.next = stack.pop();
//                 node = node.next;
//                 node.next = null;
//             }
//         }
//        return temp;
     }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode temp = new ReverseASinglyLinkedList().reverseList(node1);

        while(temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }

    }
}
