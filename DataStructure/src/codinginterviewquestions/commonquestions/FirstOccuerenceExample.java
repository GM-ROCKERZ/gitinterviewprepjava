package codinginterviewquestions.commonquestions;

public class FirstOccuerenceExample
{
    public static void main(String args[])
    {
        String str = "Hello World";
        char ch ='o';
        int index = str.indexOf(ch);
        if(index==-1)
            System.out.println("Character not found");
        else
        {
            System.out.println("First Occurence of " +ch+" is at the index "+index);
        }
    }
}
