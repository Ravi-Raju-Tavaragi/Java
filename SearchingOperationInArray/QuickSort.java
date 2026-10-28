package SearchingOperationInArray;

public class QuickSort
{
    static int partition(int[] array, int low, int high)
    {
        int i = low;
        int j = high;
        int pivot = array[low];

        while (i < j) 
        {
            while(i <= high && array[i] <= pivot)
            {
                i++;
            }

            while(array[j] > pivot)
            {
                j--;
            }

            if(i < j)
            {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[low];
        array[low] = array[j];
        array[j] = temp;

        return j;
    }



    static void quickSort(int[] array, int low, int high)
    {
        if(low < high)
        {
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex - 1);
            quickSort(array, pivotIndex + 1, high);
        }
    }


    static void printArray(int arr[])
    {
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }




    public static void main(String[] args) 
    {
        int [] arrray = {50, 15, 30, 25, 60, 10, 90, 40, 70, 30};
        printArray(arrray);

        quickSort(arrray, 0, arrray.length - 1);
        System.out.println();
        printArray(arrray);
        
    }
    
}
