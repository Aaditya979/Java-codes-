package Day5;

class LL2 {

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

        // Insert at middle
        public void insertAtMiddle(int val, int position) {

            Node newNode = new Node(val);

            Node current = head;

            // Move to the node before the position
            for (int i = 1; i < position; i++) {
                current = current.next;
            }

            // Connect new node
            newNode.next = current.next;
            current.next = newNode;
        }

        // Display
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

        // Creating initial list manually
        list.head = obj.new Node(10);
        list.head.next = obj.new Node(20);
        list.head.next.next = obj.new Node(40);

        // Insert 30 at position 3
        list.insertAtMiddle(30, 3);

        list.printList();
    }
}