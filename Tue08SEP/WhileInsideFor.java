package Tue08SEP;

public class WhileInsideFor
{
    public static void main(String[] args) 
    {
        for(int i = 1; i <= 4; i++)
        {
            int j = 1;

            while (j <= 4)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
        }
        
    }
    
}
