package Tue08SEP;

public class WhileInsideWhile
{
    public static void main(String[]args)
    {
        int i = 1;

        while (i <= 3) 
        {
            int j = 1;

            while (j <= 4) 
            {
                System.out.print(j +" ");
                j++;
            }    
            System.out.println();
            i++;
        }
        
    }
    
}
