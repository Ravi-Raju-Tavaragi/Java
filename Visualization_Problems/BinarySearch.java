package Visualization_Problems;

public class BinarySearch
{
    public static int binarySearch(int[] arr, int key) 
    {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;

            if(arr[mid] == key) 
            {
                return mid;
            } 
            else if(arr[mid] < key) 
            {
                low = mid + 1;
            } else 
            {
                high = mid - 1;
            }
        }
        return -1;
    }





    public static void main(String[] args)
    {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 6;
        int result = binarySearch(numbers, key);
        System.out.println("Key " + key + " found at index: " + result);

    }
    
}
