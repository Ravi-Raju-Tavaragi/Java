package Fri04SEP;

import java.util.Scanner;

public class TodayLoop 
{
    public static void main(String[] args) 
    {
      /*   // Print powers of 2 upto 64
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Two Numbers Start and End");
      int a1 = sc.nextInt();
      int a2 = sc.nextInt();

      for(a1 = 1; a1 <= a2; a1=a1*2 )
      {
        System.out.println(a1);
      }

      //using while loop
      System.out.println("Enter two numbers start and end");
      Scanner sc = new Scanner(System.in);
      int start = sc.nextInt();
      int end = sc.nextInt();

      while (start <= end) 
      {
        System.out.println(start = start*2);
        
      }*/

      System.out.println("Enter two numbers start and end");
      Scanner sc = new Scanner(System.in);
      int start = sc.nextInt();
      int end = sc.nextInt();
      do
      {
        System.out.println(start = start * 2);
      }
      while(start <= end);
      sc.close();
    }
    
}
