package hirevue;

public class InsertMid {
  
    //Represent a node of the singly linked list  
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    public int size;  
    //Represent the head and tail of the singly linked list  
    public Node head = null;  
    public Node tail = null;  
  
    //addNode() will add a new node to the list  
    public void addNode(int data) {  
        //Create a new node  
        Node newNode = new Node(data);  
  
        //Checks if the list is empty  
        if(head == null) {  
            //If list is empty, both head and tail will point to new node  
            head = newNode;  
            tail = newNode;  
        }  
        else {  
            //newNode will be added after tail such that tail's next will point to newNode  
            tail.next = newNode;  
            //newNode will become new tail of the list  
            tail = newNode;  
        }  
        //Size will count the number of nodes present in the list  
        size++;  
    }  
  

  
    public static void main(String[] args) {  
  
        InsertMid sList = new InsertMid();  
  
        //Adds data to the list  
        sList.addNode(1);  
        sList.addNode(2);  
  
        System.out.println("Original list: ");  
        //sList.display();

    }  
}  
