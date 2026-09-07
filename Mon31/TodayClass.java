package Mon31;

import java.util.*;

public class TodayClass 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        System.out.println("Enter First Number : ");
        a = sc.nextInt();
        System.out.println("Enter Second Number : ");
        b = sc.nextInt();

        c = a + b;

        System.out.println("Sum of Two Numbers is : "+c);

        
     /*  Scanner sm = new Scanner(System.in);
      
        System.out.println("Enter Two Numbers");
        int d = sm.nextInt();
        int e = sm.nextInt();
        int f = d - e;
        System.out.println("Result :"+f);*/

        Scanner sm = new Scanner(System.in);
        int a1,b1,c1;
        System.out.println("Enter Two Numbers");
        a1 = sm.nextInt();
        b1 = sm.nextInt();
        c1 = a1 - b1;
        System.out.println(c1);
        sc.close();
        sm.close();
    
    }
    
}
