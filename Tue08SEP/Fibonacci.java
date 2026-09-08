package Tue08SEP;

import java.util.Scanner;

public class Fibonacci 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int a = 0;
        int b = 1;
        int c;

        System.out.println(a + "," +b + ",");
        for(int i = 0; i <= num - 2; i++)
        {
            c = a + b;
            System.out.println(c+"");
            a = b;
            b = c;
        }
        sc.close();
    }
    
}
