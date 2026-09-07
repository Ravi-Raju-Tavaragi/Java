package Mon07SEP;

import java.util.Scanner;

public class TodayLoop
{
    public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number you want to print :");
       int num = sc.nextInt();
       
      while (num > 0) 
      {
        int digit = num % 10;
        num = num / 10;
        System.out.println(digit); 
      }
      sc.close();
    }
    
}
