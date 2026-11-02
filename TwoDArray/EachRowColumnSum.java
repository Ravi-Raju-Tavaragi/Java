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

        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            int sum2 = 0;
            for(int j = 0; j < a[0].length; j++)
            {
                sum2 = sum2 + a[j][i];
            }
            System.out.println(sum2);
        }

        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                System.out.print(a[j][i] + " ");
            }
            System.out.println();
        }

        // Finding maximum Element in 2DARRAY
        int max_element = a[0][0];
        System.out.println();
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                if(max_element < a[i][j])
                    max_element = a[i][j];   
            }
        }
        System.out.println("Max Element in 2D Array : "+max_element);

    }
    
}
