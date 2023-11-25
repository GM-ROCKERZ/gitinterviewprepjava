package Linkedlist;

class Node2
{
    int data;
    Node2 next;
    Node2(int x)
    {
        data = x;
        next = null;
    }
}
public class InsertElementAtTheEnd
{
    static Node2 insertEnd(Node2 head,int x)
    {
        Node2 temp = new Node2(x);
        if(head==null)
            return temp;
        Node2 current = head;
        while(current.next!=null)
            current = current.next;
        current.next = temp;
        return head;

    }
    public static void main(String args[])
    {
        Node2 head = null;
        head = insertEnd(head,10);
        head = insertEnd(head,20);
        head = insertEnd(head, 30);
        head = insertEnd(head ,40);
        head = insertEnd(head,50);
        System.out.println("before deleting the node at the end \n");
        printList(head);
        delNodeAtEnd(head);
        System.out.println("\nAfter deleting node at the end \n");
        printList(head);
    }

    private static void printList(Node2 head)
    {
        Node2 current = head;
        while(current!=null)
        {
            System.out.print(current.data+ " ");
            current = current.next;
        }
    }
    static Node2 delNodeAtEnd(Node2 head)
    {
        if(head==null)
            return null;
        if(head.next==null)
            return null;
        Node2 curr = head;
        while(curr.next.next!=null)
        {
            curr = curr.next;

        }
        curr.next = null;
        return head;
    }
}
