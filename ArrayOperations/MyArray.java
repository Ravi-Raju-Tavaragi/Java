package ArrayOperations;

public class MyArray
{
    int[] array;//place to store element
    int length;//total size of the array
    int rightIndex;//pointing at empty box

    public MyArray()
    {
        length = 5;
        array = new int[length]; // [0][0][0][0][0] --> initial array
        rightIndex = 0;
    }



    // insert at end
    public void insertAtEnd(int value)
    {
        if ( rightIndex == length)
        {
            System.out.println("Array is Full");
            return ;
        }

        array[rightIndex] = value;
        rightIndex++; // After index at the end size was updated to inserted element

    }
    
}
