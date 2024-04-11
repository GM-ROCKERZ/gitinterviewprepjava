package datasturcutrebasics.linkedlist;

public class Main
{
    public static void main(String args[])
    {
        DoublyLinkedList myDll = new DoublyLinkedList(2);

//        myDll.getHead();
//        myDll.getTail();
//        myDll.getLength();

        myDll.append(1);
//        myDll.prepend(1);
//        myDll.printList();

//        //(2) Items - Returns 2 Node
//        System.out.println(myDll.removedLast().value);
//        //(1) Item - Returns 1 Node
//        System.out.println(myDll.removedLast().value);
//        //(0) Items - Return null
//        System.out.println(myDll.removedLast());

        //(2) Items - Returns 2 Node
        System.out.println(myDll.removeFirst().value);
        //(1) Item - Returns 1 Node
        System.out.println(myDll.removeFirst().value);
        //(0) Items - Return null
        System.out.println(myDll.removeFirst());

    }
}
