package sorting;

public class SelectionSort
{
    void sort(int arr[])
    {
        int n = arr.length;

        for(int i =0;i<n;i++)
        {
            int min_ind = i;
            for(int j =i+1;j<n;j++)
            {
                if(arr[j]<arr[min_ind])
                    min_ind = j;
            }
            int temp = arr[min_ind];
            arr[min_ind] = arr[i];
            arr[i]=temp;
        }
    }
    void printArray(int arr[])
    {
        int n= arr.length;
        for(int i =0;i<n;i++)
            System.out.print(arr[i]+ " ");
        System.out.println();
    }

    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {10,5,8,20,2,18};
        ob.sort(arr);
        System.out.println("sorted array");
        ob.printArray(arr);
    }
}
