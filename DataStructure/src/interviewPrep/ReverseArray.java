package interviewPrep;

public class ReverseArray
{
    static void revArr(int[] arrNum)
    {
        int n = arrNum.length-1;

        for (int i =0;i< arrNum.length/2;i++)
        {
            int temp = arrNum[i];
            arrNum[i] = arrNum[n-i];
            arrNum[n-i] = temp;
        }
    }

    public static void main(String args[])
    {
        int[] arr = {2,4,5,7,10,23,19};
        revArr(arr);
        for(int i : arr)
        {
            System.out.print(" "+i);
        }

        }
    }

