package Thu10SEP;

import java.util.Scanner;

public class InstanceNonVoid
{
    boolean isEven(int n)
    {
        return n % 2 == 0;
    }


    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number :");
        int n = sc.nextInt();

        Instancevoid obj = new Instancevoid();
        obj.checkEvenOdd(n);

        sc.close();
    }
    
}
