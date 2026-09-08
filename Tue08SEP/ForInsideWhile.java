package Tue08SEP;

public class ForInsideWhile
{
    public static void main(String[]args)
    {
        int i = 1;

        while (i <= 3) 
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.print("* ");
            }
            
            System.out.println();
            i++;
        }
    }
    
}
