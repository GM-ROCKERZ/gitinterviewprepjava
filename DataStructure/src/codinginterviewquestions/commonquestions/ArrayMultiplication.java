package codinginterviewquestions.commonquestions;

public class ArrayMultiplication
{
    public static void main(String args[])
    {
        int[] arr = {2,3,4,5,6};
        int n = arr.length;
        //Initialize a new array to store the result
        int[] result = new int[n];

        //Compute the product of element to the left of each element
        int left_product = 1;
        for(int i =0;i<n;i++)
        {
            result[i] = left_product;
            left_product*=arr[i];
        }
        //Compute the product of element to the right of each element
        int right_product = 1;
        for(int i = n-1;i>=0;i--)
        {
            result[i]*=right_product;
            right_product*=arr[i];
        }
        //print the result
        for(int i=0;i<n;i++)
        {
            System.out.println(result[i]+" ");
        }
    }
}
