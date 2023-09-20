package linkedlist.problems;

//https://www.geeksforgeeks.org/reverse-a-linked-list-in-groups-of-given-size/
public class ReverseLinkedList {
    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d)
        {
            data = d;
            next = null;
        }
    }


    public Node reverse(Node head){
        Node tail = head;

        Node current = head;
        Node next = null;
        Node prev = null;
        int k = 0;
        while (++k<=2 && current!=null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        if (next!=null)
            tail.next = reverse(current);

        return prev;
    }


    void printList(Node node)
    {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    // Driver Code
    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
