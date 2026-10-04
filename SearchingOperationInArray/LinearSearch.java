package SearchingOperationInArray;

import java.util.Scanner;

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
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int array[] = new int[n];

        System.out.println("Enter "+n+" Elements");

        for(int i = 0; i < n; i++)
        {
            array[i] = sc.nextInt();
        }

        System.out.println("Enter search element");
        int key = sc.nextInt();

        linearSearch(array, key);

        sc.close();
    
    } 
    
}
