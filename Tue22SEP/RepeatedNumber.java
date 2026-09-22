package Tue22SEP;

import java.util.Scanner;

public class RepeatedNumber
{
    void countNumber(int[] numbers, int key) 
    {
        int count = 0;

        for (int num : numbers) 
        {
            if (num == key) 
            {
                count++;
            }
        }

        System.out.println(key + " occurs " + count + " times.");
    }




    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {10, 20, 10, 30, 10, 40, 20, 10};

        System.out.print("Enter number to search: ");
        int key = sc.nextInt();

        RepeatedNumber obj = new RepeatedNumber();

        obj.countNumber(numbers, key);

        sc.close();
        
    }
    
}
