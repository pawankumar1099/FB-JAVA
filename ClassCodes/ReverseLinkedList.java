class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    // Add a new node at the end
    void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Display all nodes
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Get next element of a specific value
    void printNextOf(int value) {
        Node temp = head;
        while (temp != null && temp.next != null) {
            if (temp.data == value) {
                System.out.println("Next of " + value + " is " + temp.next.data);
                return;
            }
            temp = temp.next;
        }
        System.out.println("No next element found for " + value);
    }
}

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.display();
        list.printNextOf(20);
    }
}
