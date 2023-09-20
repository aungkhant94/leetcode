package linkedlist.problems;

import javafx.util.Pair;

//https://www.geeksforgeeks.org/add-two-numbers-represented-by-linked-list/
public class FormNumber {

    Node head;
     static class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    public static Pair<Integer, Integer> formNumber(Node head){

        if(head.next==null)
            return new Pair<>(1,head.value);

        Pair<Integer,Integer> p = formNumber(head.next);
        int key = p.getKey()*10;
        int value = (key*head.value) + p.getValue();

        return new Pair<>(key,value);
     }

    public static void main(String[] args) {

        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        Pair<Integer, Integer> p =  formNumber(node);
        System.out.println(p.getValue());
    }
}
