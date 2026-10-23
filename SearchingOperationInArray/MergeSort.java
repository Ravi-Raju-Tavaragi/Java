package SearchingOperationInArray;

public class MergeSort
{
    static void Mergesort(int[] array, int low, int high)
    {
        if(low >= high)
            return;

        int mid = low + ((high - low) / 2);

        Mergesort(array, low, mid);
        Mergesort(array, mid + 1, high);
        Merge(array, low, mid, high);

    }


    static void Merge(int[] array, int low, int mid, int high)
    {
        int[] temp = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= high) 
        {
            if(array[i] <= array[j])
            {
                temp[k] = array[i];
                i++;
            }
            else
            {
                temp[k] = array[j];
                j++;
            }

            k++;
        }

        while(i <= mid)
        {
            temp[k] = array[i];
            i++;
            k++;
        }

        while(j <= high)
        {
            temp[k] = array[j];
            j++;
            k++;
        }

       
        for(i = low, k = 0; i <= high; i++, k++)
        {
            array[i] = temp[k];
        }


        /*
        for(k = 0; k < temp.length; k++)
        {
            array[low + k] = temp[k];
        }

        */

    }

    public static void main(String[] args) 
    {
        int[] array = {10, 4, 8, 5, 6, 3, 7, 2, 1};
        System.out.println("\nUn-Sorted array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ ", ");
        }

        Mergesort(array, 0, array.length - 1);
        System.out.println("\nSorted array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ ", ");
        }
        
        int[] array1 = {};
        System.out.println("\nUn-Sorted array");
        for(int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+ ", ");
        }

        Mergesort(array1, 0, array1.length - 1);
        System.out.println("\nSorted array");
        for(int i = 0; i < array1.length; i++)
        {
            System.out.print(array1[i]+ ", ");
        }
    }
    
}
