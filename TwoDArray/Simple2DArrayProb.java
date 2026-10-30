package TwoDArray;

public class Simple2DArrayProb
{
    public static void main(String[] args) 
    {
        int[] [] a = new int[3][3];

        //store 10 numbers
        int count = 1;

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                a[i][j] = count;
                System.out.print(a[i][j] + " ");
                count++;
            }
            System.out.println();
        }
        
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
            System.out.println();
        }
    }
    
}
