package Linkedlist;

class Node5
{
    int data;
    Node5 prev;
    Node5 next;
    Node5(int d)
    {
        data = d;
        prev = null;
        next =null;
    }
}
public class DoublyLinkedListInsertAtEnd
{
    public static void main(String args[]){
        Node5 head = new Node5(10);
        Node5 temp1 = new Node5(20);
        Node5 temp2 = new Node5(30);
        head.next = temp1;
        temp1.prev = head;
        temp1.next = temp2;
        temp2.prev = temp1;
        head=insertAtEnd(head,40);
        printList(head);

    }

    static Node5 insertAtEnd(Node5 head,int data)
    {
        Node5 temp = new Node5(data);
        if(head==null) return temp;
        Node5 curr = head;
        while(curr.next != null)
        {
            curr = curr.next;
        }
        curr.next=temp;
        temp.prev = curr;
        return head;
    }
    public static void printList(Node5 head)
    {
        Node5 curr = head;
        while(curr.next !=null)
        {
            System.out.print(curr.data+ " ");
            curr = curr.next;
        }
    }

}
