package Tue01SEP;

import java.util.Scanner;

public class ClassWork 
{
    public static void main(String[] args) 
    {
        //college admission
      /*int marks = 80;
        boolean passed_exam = true;
        if(marks >= 85 && passed_exam == true)
        {
            System.out.println("WELCOME TO ADMISSON PROCESS");
        }
        else
        {
            System.out.println("Sorry Your Not Match our cretieria");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Yor Marks :");
        int m1 = sc.nextInt();
        System.out.println("Did You Passed The Exam True/False :");
        boolean pass_exam = sc.nextBoolean();

        if(m1 >= 85 && pass_exam == true)
        {
            System.out.println("WELCOME TO ADMISSION PROCEES");
        }
        else
        {
            System.out.println("Sorry, Try Next Year");
        }
        sc.close();
    }
    
}
