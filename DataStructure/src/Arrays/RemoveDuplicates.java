package Arrays;

public class RemoveDuplicates
{
    static int remdupe(int arr[],int n)
    {
        int res = 1;
        for(int i = 1;i<n;i++)
        {
            if(arr[res]!=arr[res-1])
            {
                arr[res] = arr[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String args[])
    {
        int arr[] ={10,20,20,30,30,30};
        int arrsize = remdupe(arr,arr.length);
        System.out.println(arrsize);
    }
}
