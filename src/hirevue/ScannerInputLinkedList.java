package hirevue;

import java.util.*;
class ScannerInputLinkedList{

 static class Node{
    int data;
    Node next;
}
void insertNode(Node head, int data){
    Node curr = head;

    Node temp = new Node();
    temp.data = data;
    temp.next = null;

    while(curr.next!=null){

        curr = curr.next;
    }
    curr.next = temp;
    System.out.println(curr.data+"data->");
    System.out.println(curr.next.toString()+"next->");
}
public static void main(String[] args) {
    ScannerInputLinkedList obj = new ScannerInputLinkedList();
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int x;
    Node head = new Node();
    while(t-- > 0){
        x = sc.nextInt();
        obj.insertNode(head, x);

    }
}
}
