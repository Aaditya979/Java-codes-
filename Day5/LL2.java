package Day5;

public class LL2 {

    // 1. Definition of a singly-linked list node

    class Node {

        int data;

        Node next;

        public Node(int data) {

            this.data = data;

            this.next = null;

        }

    }

    // 2. LinkedList class managing the nodes

 
    class LinkedList{
        Node head;

        // Insert at beginning 

        public void insertAtBeginning(int val) { //its job is to add new node at beginning , val is the value we want to insert  

            Node newNode = new Node(val);   //creating a new node   

            newNode.next = head;   // connect new node to old head 

            head = newNode;

        }

        // Display the linked list

        public void printList() {  //This method displays the linked list 

            Node current = head;

            while (current != null) {

                System.out.print(current.data + " -> ");

                current = current.next;

            }

            System.out.println("null");

        }

    }

    // 3. Main method

    public static void main(String[] args) {

        LL2 obj = new LL2();

        LinkedList list = obj.new LinkedList();       //this creates actual linked list 

        list.insertAtBeginning(30);

        list.insertAtBeginning(20);

        list.insertAtBeginning(10);

        System.out.print("Linked List after insertions: ");

        list.printList();

    }

}