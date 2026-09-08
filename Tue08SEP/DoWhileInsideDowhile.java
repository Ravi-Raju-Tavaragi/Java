package Tue08SEP;

public class DoWhileInsideDowhile
{
    public static void main(String[]args)
    {
        int i = 1;

        do
        {
            int j = 1;
            do
            {
                System.out.print("* ");
                j++;
            }while(j <= 4);

            System.out.println();
            i++;
        }while(i <= 3);
    }
    
}
