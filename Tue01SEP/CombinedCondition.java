package Tue01SEP;

public class CombinedCondition 
{
    public static void main(String[] args) 
    {
        int age = 25;
        boolean citizen = true;

        if (age >= 18 && citizen) 
        {
            System.out.println("Eligible");
        }
        else
        {
            System.out.println("Not Eligible");
        }
        
    }
    
}
