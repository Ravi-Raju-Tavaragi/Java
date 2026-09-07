package Fri04SEP;

import java.util.Scanner;

public class Radix 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        String num = sc.next();//"127"like word it is
        boolean octal = true;//assume the nuber is octal
        boolean binary = true;
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if(ch < '0' || ch > '7')
            {
                octal = false;
                break;
            }
        }
            if(octal)
            {
                System.out.println("Yes it is Octal and Radix, Base is 8");
            }
            else
            {
                System.out.println("No This is not Octal Number");
            }
        
        for(int i = 0; i <= num.length()-1; i++)
        {
            char ch = num.charAt(i);
            if(ch < '0' || ch > '1')
            {
                binary = false;
                break;
            }
        }
        if(binary)
        {
            System.out.println("Yes it is Binary and Radix(Base) is 2");
        }
        else
        {
            System.out.println("No it is not Binary");
        }
        sc.close();
       


    }
    
}
