package Tue22SEP;

public class SearchElement
{
    static boolean search(int[] arr, int key)
    {
        for(int X : arr)
        {
            if(X == key)
            {
                return true;
            }
        }
        return false;

    }


    public static void main(String[] args) 
    {
        int[] arr = {10, 20, 30, 50};
        System.out.println(search(arr, 30));
        System.out.println(search(arr, 60));     
    }
    
}
