package Fri25SEP;

public class ArrayLefttoRight
{
    static void printLeftToRight(int[] array)
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i]);
        
        if(i != array.length-1)
        {
            System.out.print("-->");
        }
        }
    }

    static void printRightToLeft(int[] array)
    {
       System.out.println();
        for(int i = array.length-1; i >= 0; i--)
        {
            System.out.print(array[i]);
        
        if(i != 0)
        {
            System.out.print("-->");
        }
        }

    }


    static void prinFromBothSidesTowardsEnd(int[] array)
    {
        System.out.println();

        int leftIdex = array[0];
        int rightIndex = array.length;

        while(leftIdex <= rightIndex)
        {
            System.out.print(leftIdex +" ");  
            leftIdex++;
            System.out.print(rightIndex +" ");
            rightIndex--; 
                    
        }
        

    }



    public static void main(String[] args)
    {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        printLeftToRight(array);
        printRightToLeft(array);
        prinFromBothSidesTowardsEnd(array);
        
    }
    
}
