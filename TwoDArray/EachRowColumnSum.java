package TwoDArray;

public class EachRowColumnSum
{
    public static void main(String[] args) 
    {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        
        for(int i = 0; i < a.length; i++)
        {
            int sum1 = 0;
            for(int j = 0; j < a[0].length; j++)
            {
                sum1 = sum1 + a[i][j];
            }
            System.out.println(sum1);
        }

        
        for(int i = 0; i < a.length; i++)
        {
            int sum2 = 0;
            for(int j = 0; j < a[0].length; j++)
            {
                sum2 = sum2 + a[j][i];
            }
            System.out.println(sum2);
        }

    }
    
}
