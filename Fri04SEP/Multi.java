package Fri04SEP;

import java.util.Scanner;

public class Multi 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numer of multiplication table to print");
        int mul = sc.nextInt();
        int n = 10;
        int res;

        for(n=1; n<=10; n++)
        {
            res = mul * n;
            System.out.println(mul+"*"+n+"="+res);
        }
        sc.close();

    }
    
}
