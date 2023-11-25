package Linkedlist;

class Node1
{
    int data;
    Node1 next;
    Node1(int x)
    {
        data = x;
        next = null;
    }
}
public class InsertElementAtBegining {
    static Node1 insertBegin(Node1 head, int x) {
        Node1 temp = new Node1(x);
        temp.next = head;
        return temp;
    }

    public static void main(String args[]) {
        Node1 head = null;
        head = insertBegin(head, 30);
        head = insertBegin(head, 20);
        head = insertBegin(head, 10);
        printlist(head);

    }

    private static void printlist(Node1 head) {
        Node1 current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

    }
}
