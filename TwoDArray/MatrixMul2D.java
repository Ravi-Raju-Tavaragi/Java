package TwoDArray;

public class MatrixMul2D
{
    public static void main(String[] args) 
    {
        
        int[] [] a = {{1, 2, 3}, {0, 1, 4}, {5, 6, 0}};
        int[] [] b = {{1, 0, 2}, {3, 2, 1}, {1, 1, 0}};
        int[] [] c = new int[3][3];

        for(int i = 0; i < c.length; i++)
        {
            for(int j = 0; j < c[i].length; j++)
            {
                for(int k = 0; k < a[0].length; k++)
                {
                    c[i][k] = ((a[i][j] * b[i][j]) + (a[i][j] * b[i][j]) + (a[i][j] * b[i][j]));
                }
            }
        }

        for(int[] x : c)
        {
            for(int y : x)
            {
                System.out.print(y +" ");
            }
            System.out.println();
        }
    }
    
}
