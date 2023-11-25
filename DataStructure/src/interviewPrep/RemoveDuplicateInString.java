package interviewPrep;

public class RemoveDuplicateInString
{
    static String removeDup(String str)
    {
        String strNoDup = " ";
        for(char ch : str.toCharArray())
        {
            if(!strNoDup.contains(String.valueOf(ch)))
            {
                strNoDup+= ch;
            }
        }
        return strNoDup;
    }

    public static void main(String args[])
    {
        String str = "apple";
        String strNoduplicate = removeDup(str);
        System.out.println("String without duplicates is : " + strNoduplicate);
    }
}
