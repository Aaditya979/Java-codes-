package Day5;

class LinkedList {

    class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        LinkedList.Node first = list.new Node(10);
        LinkedList.Node second = list.new Node(20);

        first.next = second;
        second.next = null;

        list.head = first;

        // Display the linked list
        LinkedList.Node current = list.head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }
}