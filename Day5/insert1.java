package Day5;

public class LL2 {

    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    class LinkedList {
        Node head;

        // Insert at last
        public void insertAtLast(int val) {

            Node newNode = new Node(val);

            // If list is empty
            if (head == null) {
                head = newNode;
                return;
            }

            // Traverse to the last node
            Node current = head;

            while (current.next != null) {
                current = current.next;
            }

            // Add new node at the end
            current.next = newNode;
        }

        // Display the linked list
        public void printList() {
            Node current = head;

            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }

            System.out.println("null");
        }
    }

    public static void main(String[] args) {

        LL2 obj = new LL2();
        LinkedList list = obj.new LinkedList();

        list.insertAtLast(30);
        list.insertAtLast(20);
        list.insertAtLast(10);

        list.printList();
    }
}