package Arrays;

public class MovesZeroToEnd
{
    static void moveZero(int arr[])
    {
        int n = arr.length;
        int count = 0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=0)
            {
                swapFun(arr[i] ,arr[count]);
                count++;
            }
        }
    }
    static void swapFun(int a,int b)
    {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String args[])
    {
        int arr[] = {0,3,2,3,0,0,5};
        moveZero(arr);
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"");
        }
    }
}
