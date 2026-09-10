package Thu10SEP;

import java.util.Scanner;

public class TodayClass
{
    //Static void 
    static void checkEvenOdd(int n)
    {
        if(n % 2 == 0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("odd");
        }

    }



    public static void main (String[]args)
    {
        //Take input and call
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        checkEvenOdd(n);

        sc.close();
    }
    
}
