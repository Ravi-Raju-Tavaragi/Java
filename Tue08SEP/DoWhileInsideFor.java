package Tue08SEP;

public class DoWhileInsideFor 
{
    public static void main(String[]args)
    {
        int i = 1;
        do
        {
            for(int j = 1; j <= 4; j++)
            {
                System.out.print("*");
            }

            System.out.println();
            i++;
        }while(i <= 4);
    }
    
}
