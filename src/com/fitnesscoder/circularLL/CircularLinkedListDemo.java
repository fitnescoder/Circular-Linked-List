package com.fitnesscoder.circularLL;

public class CircularLinkedListDemo {

    private static Node insertAtTail(int data, Node tail) {
        if(tail==null) {
            Node temp=new Node(data);
            tail=temp;
            tail.next=tail;
            return tail;
        }

        Node forward=tail.next;
        Node temp=new Node(data);
        tail.next=temp;
        temp.next=forward;
        tail=temp;
        return tail;

    }

    private static Node deleteAtTail(Node tail) {
        Node curr=tail;

        do {
            curr=curr.next;
        } while (curr.next!=tail);

        curr.next=tail.next;
        tail=curr.next;
        return tail;
    }

    private static void printCircularLL(Node tail) {
        Node curr=tail;
        do{
            System.out.print(curr.data+" ");
            curr=curr.next;
        } while(curr!=tail);
        System.out.println();
    }

    public static void main(String[] args) {
        Node tail=null;
        tail=insertAtTail(10,tail);
        tail=insertAtTail(20,tail);
        tail=insertAtTail(30,tail);
        tail=insertAtTail(40,tail);

        System.out.println("===After Insertion at Tail===");
        printCircularLL(tail);

        tail=deleteAtTail(tail);
        System.out.println("==After Delete At Tail===");
        printCircularLL(tail);
    }




}
