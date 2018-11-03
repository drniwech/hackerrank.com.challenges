/*
https://www.hackerrank.com/challenges/ctci-linked-list-cycle/problem

Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    if (head == null) return false;
    
    Node left = head;
    Node right = head.next;
    while (left != right) {
        if (right == null || right.next == null) return false;
        
        left = left.next;
        right = right.next.next;
    }
    
    return true;
}
