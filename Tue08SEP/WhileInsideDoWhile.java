package Tue08SEP;

public class WhileInsideDoWhile
{
    public static void main(String[]args)
    {
        int i = 1;

        do
        {
            int j = 1;

            while(j <= 4)
            {
                System.out.print("*");
                j++;
            }

            System.out.println();
            i++;
        }while(i <= 4);
    }
    
}
