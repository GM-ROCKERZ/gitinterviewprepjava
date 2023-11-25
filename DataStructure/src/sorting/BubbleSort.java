package sorting;

public class BubbleSort
{
    static void bubbleSort(int arr[])
    {
        int n = arr.length;

        for(int i =0;i<n-1;i++){
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    swap(arr[j],arr[j+1]);
                    swapped = true;
                }
            }
            if(swapped==false)
                break;
        }
    }

    private static void swap(int x, int y)
    {
       int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String args[])
    {
        int arr[] = {5,3,7,9,10,6};
        bubbleSort(arr);
        for (int i=0;i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
