package Arrays;

public class FindArrayElemnet
{
    public static void main(String args[])
    {
        int arr[] = {20,5,7,25};
        int n = arr.length;
        int result = searchElement(arr,n,5);
        System.out.println(result);
    }
    static int searchElement(int arr[],int n,int x)
    {
        for (int i =0;i<n;i++)
        {
            if(arr[i]==x)
            {
                return i;
            }
        }
        return -1;
    }

}
