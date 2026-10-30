package TwoDArray;

public class AdditionOf2DArray
{
    public static void main(String[] args) 
    {
        int[] [] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] [] b = {{1, 0}, {0, 1}, {0, 0}};
        int[] [] c = new int[3][3];

        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c[i].length; j++)
            {
                if(j < 2)
                    c[i][j] = a[i][j] + b[i][j];
                else
                    c[i][j] = a[i][j] + 0;
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
