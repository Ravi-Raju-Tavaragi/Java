package Tue01SEP;

import java.util.Scanner;

public class TodayClass 
{
    public static void main(String[] args) 
    {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age :");
        int age = sc.nextInt();
        if(age >= 18)
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }

        sc.close();
        // if-else-if --> lader
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age :");
        int age = sc.nextInt();
        if(age == 18)
        {
            System.out.println("Eligible");
        }
        else if(age < 18 && age != 0)
        {
            System.out.println("Not Eligible");
        }
        else 
        {
            System.out.println("grow up");
        }

        sc.close();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age :");
        int age = sc.nextInt();

        System.out.println("Citixwnship : true/false");
        boolean citizen = sc.nextBoolean();

        if( age >= 18)
        {
            if(citizen)
            {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("Not Eligible");
            }
        }
        else
        {
            System.out.println("Age less Than 18");
        }


       //SWitch()
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter Day Numbers 1 to 7:");
       int day = sc.nextInt();
       
       switch (day) 
       {
        case 1:
            System.out.println("Monday");
            break;
         case 2:
            System.out.println("Tuesaday");
            break;    
         case 3:
            System.out.println("Wednsday");
            break;
         case 4:
            System.out.println("Thursaday");
            break;
         case 5:
            System.out.println("Friday");
            break;
         case 6:
            System.out.println("Saturday");
            break;    
         case 7:
            System.out.println("Sonday");
            break;    
        default:
            System.out.println("Invalid Day");
            
       }*/
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your age :");
        int age = sc.nextInt();
        String result = (age >= 18)? "Yes":"No";
        
        switch (result) 
        {
            case "Yes":
                System.out.println("Eligible");
                break;
            case "No":
                System.out.println("Not Eligible");
                break;
            default:
                System.out.println("Invalid");
        }


        sc.close();

        
    }
    
}
