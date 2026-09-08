package Tue08SEP;

public class ForInsideDoWhile
{
    public static void main(String[]args)
    {
        for(int i = 1; i <= 4; i++)
        {
            int j = 1;
            do
            {
                System.out.print("*");
                j++;
            }while(j <= 4);

            System.out.println();
        }
    }
    
}
