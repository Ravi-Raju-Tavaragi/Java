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

        int leftIdex = 0;
        int rightIndex = array.length-1;

        while(leftIdex <= rightIndex)
        {
            System.out.print(array[leftIdex] +" -> " + array[rightIndex] + " -> ");  
            leftIdex++;
            rightIndex--;              
        }     
    }


    
        

        /*int result;
        result = array[array.length] % 2;
        
        if(result == 0)
        {
        leftIndex = array[array.length] - (result-1);
        rightIndex = array[array.length] - result;
        }
        else
        {
            leftIndex = array[array.length] - result;
            rightIndex = array[array.length] - result;
        }*/




    static void printFromCenterTowardsBothEnd(int[] array)
    {
       System.out.println();

        int leftIndex = 0;
        int rightIndex = 0;
       if(array.length % 2 == 0)
       {
        leftIndex = (array.length / 2) - 1;
        rightIndex = array.length / 2;

         while (leftIndex >= 0 && rightIndex <= array.length) 
        {
            System.out.print(array[leftIndex] +" -> " + array[rightIndex] + " -> ");  
            leftIndex--;
            rightIndex++; 
        }

       }
       else
        {
            leftIndex = array.length / 2;
            rightIndex = array.length / 2;

            while (leftIndex >= 0 && rightIndex <= array.length) 
        {
            if(leftIndex == rightIndex)
            {
                System.out.print(array[leftIndex] + " -> ");  

            }
            else
            {
            System.out.print(array[leftIndex] +" -> " + array[rightIndex] + " -> ");    
            } 
            leftIndex--;
            rightIndex++;
        }

        }
    }
    



    public static void main(String[] args)
    {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
        printLeftToRight(array);
        printRightToLeft(array);
        prinFromBothSidesTowardsEnd(array);
        printFromCenterTowardsBothEnd(array);
        
    }
    
}
