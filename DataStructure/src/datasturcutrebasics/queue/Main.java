package datasturcutrebasics.queue;

public class Main
{
    public static void main(String args[])
    {
        Queue myQueue = new Queue(2);

//        myQueue.getFirst();
//        myQueue.getLast();
//        myQueue.getLength();

        myQueue.enqueue(1);

    //(2) Items Returns 2 Node
        System.out.println(myQueue.dequeue().value);
    // (1) Item - Return 1 Node;
        System.out.println(myQueue.dequeue().value);
    //(0) Items - Return null
        System.out.println(myQueue.dequeue());

    }
}
