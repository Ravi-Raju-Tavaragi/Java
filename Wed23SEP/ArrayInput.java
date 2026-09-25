package Wed23SEP;

import java.util.Scanner;

public class ArrayInput
{
    void display(int[] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            a[i] = a[i] * 10;
        }
        System.out.println(a);
    }

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter "+n+" Elements");

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }

        ArrayInput obj = new ArrayInput();

        obj.display(a);
    sc.close();
        
    }
    
}
