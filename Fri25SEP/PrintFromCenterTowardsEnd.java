package Fri25SEP;

public class PrintFromCenterTowardsEnd
{
    public static void prinFromBothSidesTowardsEnd(int[] array)
    {
    int leftIndex;
    int rightIndex;
    int result;
    result = array[array.length] % 2;
        
    if(result == 0)
    {
        leftIndex = array[array.length] - (result-1);
        rightIndex = array[array.length] - result;
        while (leftIndex >= 0 && rightIndex <= array.length) 
        {
            System.out.print(array[leftIndex] +" -> " + array[rightIndex] + " -> ");  
            leftIndex--;
            rightIndex++; 
        }
    }
    else
    {
    leftIndex = array[array.length] - result;
    rightIndex = array[array.length] - result;
    while (leftIndex <= 0 && rightIndex <= array.length) 
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
        prinFromBothSidesTowardsEnd(array);
        
    }
    
}
