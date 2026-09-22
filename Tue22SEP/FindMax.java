package Tue22SEP;

public class FindMax
{
    static int findMaxNum(int[] arr)
    {
        int max = arr[0];

        for(int var : arr)
        {
           if(var > max)
           {
            max = var;
           }
        }
        return max;

    }


    public static void main(String[] args)
    {
        int[] arr = {10, 15, 12, 20, 25};
        System.out.println(findMaxNum(arr));
    }
    
}
