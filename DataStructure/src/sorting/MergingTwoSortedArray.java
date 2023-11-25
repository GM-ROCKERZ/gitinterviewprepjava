package sorting;

public class MergingTwoSortedArray
{
    static void merge(int arr[],int arr1[])
    {
        int m = arr.length;
        int n = arr1.length;
        int i=0 ,j =0;

        while(i<m && j<n)
        {
            if(arr[i] <= arr1[j])
            {
                System.out.print(arr[i]+ " ");
                i++;
            }
            else
            {
                System.out.print(arr1[j] + " ");
                j++;
            }
        }
        while(i<m)
        {
            System.out.print(arr[i] + " ");
            i++;
        }
        while(j<n)
        {
            System.out.print(arr1[j] + " ");
            j++;
        }
    }

    public static void main(String[] args)
    {
        int arr[] = {10,20,50};
        int arr1[] = {5,50,50};
        merge(arr,arr1);
    }
}
