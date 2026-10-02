package SearchingOperationInArray;

public class LinearSearch
{
    public static void linearSearch(int[] array, int key)
    {
        boolean found = false; // key not found

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == key)
            {
                System.out.println("Element found at index : "+i);
                found = true;
                break;
            }

        }

        if (found == false)
        {
            System.out.println("Element Not Found");
            
        }

    }




    public static void main(String[] args) 
    {
        
        int[] array = {10, 20, 30, 40, 50};
        int key = 40;

        linearSearch(array, key);
    
    } 
    
}
