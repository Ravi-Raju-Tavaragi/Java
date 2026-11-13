package DSA;

public class MoveNonZeroElement
{
    public static void removeZeroatEnd(int array[])
    {
        int firstnonZeroElement = 0;
        int index = 0;

        while(index < array.length)
        {
            if(array[index] != 0)
                break;

            firstnonZeroElement++;
            index++;
        }

        int writeIndex = 0;
        for(int index1 = firstnonZeroElement; index1 < array.length; index1++)
        {
            array[writeIndex] = array[index1];
            writeIndex++;
        }

        int index2 = firstnonZeroElement;
        while(index2 < array.length)
        {
            array[index2] = 0;
            index2++;
        }
    }

    public static void printArray(int array[])
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]+" ");
        }
    }
    public static void main(String[] args) 
    {
        int array[] = {0, 0, 0, 2, 4, 8};
        printArray(array);
        System.out.println();


        
    }
    
}
