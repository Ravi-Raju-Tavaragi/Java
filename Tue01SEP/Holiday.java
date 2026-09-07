package Tue01SEP;

import java.util.Scanner;

public class Holiday 
{
    public static void main(String[] args) 
    {
        /*String day ="Monday";
        if(day.equals("Saturday") || day.equals("Sunday"))
        {
            System.out.println("It's Holiday");
        }
        else
        {
            System.out.println("Get Back to Work Buddy---");
        }*/

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String :");
    String dayy = sc.nextLine();
    if(dayy.equals("Saturday") || dayy.equals("Sunday"))
        {
            System.out.println("It's Holiday");
        }
        else
        {
            System.out.println("Get Back to Work Buddy---");

        }
    sc.close();
    }
}
