package Tue01SEP;

import java.util.Scanner;

public class LoginCheck 
{
    public static void main(String[] args) 
    {
       /*String usr_name = "Ravi";
        String password = "R123";
        if(usr_name.equals("Ravi") && password.equals("R123"))
        {
            System.out.println("Your Loged In");
        }
        else
        {
            System.out.println("Give Correct Credential's");
        }*/
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your User Name :");
        String uname = sc.nextLine();
        System.out.println("Please Enter Your Password :");
        String pwd = sc.nextLine();
        if(uname.equals("Ravi") && pwd.equals("R123"))
        {
            System.out.println("Your Loged In");
        }
        else
        {
            System.out.println("Give Correct Credential's");
        }
        
        sc.close();
    }
    
}
