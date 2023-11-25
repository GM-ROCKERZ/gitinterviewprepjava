package Linkedlist;

class Node4
{
    int data;
    Node4 prev;
    Node4 next ;
    Node4(int d)
    {
        data=d;
        prev = null;
        next = null;
    }
}

public class DoublyLinkedListInsertAtBegining
{
    public static void main(String args[])
    {
        Node4 head = new Node4(10);
        Node4 temp1 = new Node4(20);
        Node4 temp2 = new Node4(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head = insertBegin(head,5);
        printList(head);

    }

    private static Node4 insertBegin(Node4 head, int data)
    {
        Node4 temp = new Node4(data);
        temp.next = head;
        if(head != null)
            head.prev = temp;
        return temp;
    }

    public static void printList(Node4 head)
    {
        Node4 curr = head;
        while(curr!=null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }

}
