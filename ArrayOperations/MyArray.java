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

    // insert at start
    public void insertAtStart(int value)
    {
        if ( rightIndex == length)
        {
            System.out.println("Array is Full");// [50][10][20][30][40] --> initial array
            return ;
        }

        else
        {
            //shift element one position to right
            for(int i = rightIndex-1; i >= 0; i--)
            {
                array[i+1] = array[i];
            }
        }

        // inserting value at array[0]
        array[0] = value;
        rightIndex++;//we are increasing size of the array
    }


    //insert at any position
    public void insertAtAnyPosition(int value, int position)
    {
        if ( rightIndex == length )
        {
            System.out.println("Array is full");
            return ;
        }

        if ( position < 0 || position > rightIndex)
        {
            System.out.println("Invalid position");
            return ;
        }

        //shift and insert
        for(int i = rightIndex - 1; i >= position; i--)

        {
            array[i+1] = array[i];
        }

        //inserting value at position
        array[position] = value;
        rightIndex++;
    }



    //array deleting 
    // delete at end
    public void deleteFromEnd()
    {
        if ( rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return ;
        }

        array[rightIndex-1] = 0;
        rightIndex--;
    }

    //delete at start
    public void deleteFromStart()
    {
        if ( rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return ;
        }

        //shift element form index = 0 (from start)
        else
        {
            for(int i = 0; i < rightIndex; i++)
            {
                array[i] = array[i+1];
            }

        }
        rightIndex--;
        array[rightIndex] = 0;
    }

    //delete at any position
    public void deleteFromAnyPosition(int position)
    {
        if ( rightIndex == 0)
        {
            System.out.println("Array is Empty");
            return ;
        }

        if ( position < 0 || position >= rightIndex)
        {
            System.out.println("Invalid position");
            return ;
        }

        //shift element form index = 0 (from start)
        else
        {
            for(int i = position; i < rightIndex; i++)
            {
                array[i] = array[i+1];
            }

        }
        rightIndex--;
        array[rightIndex] = 0;
    }




         //print elements
    public void printArrayElements()
    {
        System.out.println("index\tvalue");
        for(int i = 0; i < length; i++)
        {
            System.out.println(i+"\t"+array[i]);
        }
        System.err.println("size : "+rightIndex);
        System.out.println();
    }

    
}
