package Linkedlist;

class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
        next = null;
    }
}

public class Test
{
    public static void main(String args[])
    {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
      //  printlist(head);
        //Recursive traversal of linked list
        rPrint(head);
    }

    private static void rPrint(Node head)
    {
        if(head == null)
            return;
        System.out.print(head.data + " ");
        rPrint(head.next);
    }

/*    private static void printlist(Node head)
    {
        Node current = head;
        while(current !=null)
        {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }*/




}
