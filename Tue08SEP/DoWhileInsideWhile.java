package Tue08SEP;

public class DoWhileInsideWhile 
{
    public static void main(String[]args)
    {
        int i = 1;

        while(i <= 4)
        {
            int j = 1;

            do
            {
                System.out.print("*");
                j++;
            }while(j <= 4);

            System.out.println();
            i++;
        }
    }
    
}
