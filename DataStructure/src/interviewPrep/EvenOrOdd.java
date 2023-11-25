package interviewPrep;

public class EvenOrOdd
{
    static void evenOrOdd(int num)
    {
        if(num%2 == 0)
            System.out.println("given number is even");
        else
            System.out.println("given number is odd");
    }
    public static void main(String args[])
    {
        int num = 25;
        evenOrOdd(num);
    }
}
