package ttsttsts;

class Node {
    int data;
    Node next;

    // Constructor to initialize the data and next pointer
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
class LinkedList {
    Node head; // Pointer to the head of the linked list

    // Method to insert data at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) {
            head = newNode; // If the list is empty, make the new node as the head
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next; // Traverse to the end of the list
            }
            current.next = newNode; // Insert the new node at the end
        }
        System.out.println("Inserted");
    }

    // Method to display the contents of the linked list
    public void display() {
        Node current = head;
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " "); // Print the data of each node
            current = current.next;
        }
        System.out.println();
    }
}

// Main class to demonstrate the usage of LinkedList
public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Insert data into the linked list
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);

        // Display the contents of the linked list
        myList.display(); // Output: LinkedList: 10 20 30
    }
}
