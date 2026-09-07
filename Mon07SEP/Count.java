package Mon07SEP;

import java.util.Scanner;

public class Count
{
 public static void main(String[]args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Number you want to count :");
       int num = sc.nextInt();
       int count = 0;
       
      while (num > 0) 
      {
        /*num = num % 10;
        count++;
        num = num / 10;*/
        num = num / 10;
        count++;
      }
      System.out.println(count);
      sc.close();
    }
    
}
