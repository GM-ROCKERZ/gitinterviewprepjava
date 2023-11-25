package Arrays;

public class LargestElement
{
    static int getLargest(int arr[])
    {
        int res =0;
        for(int i =1;i< arr.length;i++)
        {
            if(arr[i]>arr[res])
                res = i;
        }
        return arr[res];

    }

    public static void main(String args[])
    {
        int arr[] = {5,8,20,10,12,30};
        int largestElement = getLargest(arr);
        System.out.println(largestElement);
    }
}
