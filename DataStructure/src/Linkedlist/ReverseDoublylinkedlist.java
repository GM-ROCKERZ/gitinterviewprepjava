package Linkedlist;

class Node6
{
    int data;
    Node6 prev;
    Node6 next;

    public Node6(int d) {
        data = d;
        prev = null;
        next = null;
    }
}
public class ReverseDoublylinkedlist
{
    static void printlist(Node6 head)
    {
        Node6 curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+ " ");
            curr=curr.next;
        }
        System.out.println();
    }

    static Node6 reverse(Node6 head)
    {
        Node6 temp = null;
        Node6 curr = head;
        while(curr!=null)
        {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if(temp!=null)head = temp.prev;
        return head;
    }
    public static void main(String args[])
    {
        Node6 head = new Node6(10);
        Node6 temp1 = new Node6(20);
        Node6 temp2 = new Node6(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = reverse(head);
        printlist(head);
    }
}
