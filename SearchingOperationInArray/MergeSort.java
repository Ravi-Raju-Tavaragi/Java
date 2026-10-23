package SearchingOperationInArray;

public class MergeSort
{
    static int[] Mergesort(int[] array, int low, int high)
    {
        if(low >= high)
            return new int[] {-1};

        int mid = low + ((high - low) / 2);

        Mergesort(array, low, mid);
        Mergesort(array, mid + 1, high);
        Merge(array, low, mid, high);

        return array;

    }


    static int[] Merge(int[] array, int low, int mid, int high)
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

            for(k = 0; k < temp.length; k++)
            {
                array[low + k] = temp[k];
            }

            return array;

    }

    public static void main(String[] args) 
    {
        int[] array = {10, 4, 8, 5, 6, 3, 7, 2, 1};
        System.out.println("Un-Sorted array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ ", ");
        }

        Mergesort(array, 0, array.length - 1);
        System.out.println("/n Sorted array");
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+ ", ");
        }
        
    }
    
}
