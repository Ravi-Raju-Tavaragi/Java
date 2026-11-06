package TwoDArray;

public class TwoDArrayMultiplication
{
    public static int[][] multiplicationTwoD(int matrixA[][], int matrixB[][])
    {
        if(matrixA == null || matrixB == null)
            System.out.println("Array null");

        //check for empty
        /*if(matrixA.length == 0)
            System.out.println("Array Empty");
            return ;

        //Number of coloms in i 
        int colMatrixA = matrixA[0].length;

        for(int i = 0; i < matrixA.length; i++)
        {
            if(matrixA[i] == null || matrixA[i].length != colMatrixA)
            {
                System.out.println("Improrer Matrix");
                return ;
            }
        }*/

        int result[][] = new int[3][3]; 

        for(int i = 0; i < matrixA.length; i++)
        {
            for(int j = 0; j < matrixB[0].length; j++)
            {
                for(int k = 0; k < matrixB[0].length; k++)
                {
                    result[i][j] += matrixA[i][k] * matrixB[k][j]; 
                }
            }
        }
        return result;
    }

    public static void printTwoDArray(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                System.out.print(data[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void printBoundaryValues(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                if(row > 0 && row < data.length - 1 && col > 0 && col < data[col].length - 1)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print(data[row][col]+" ");
                }
            }
            System.out.println();
        }
    }

    public static void printCornerValues(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                if((row == 0 && col == 0) || 
                   (row == 0 && col == data.length - 1) || 
                   (row == data.length - 1 && col == 0) ||
                   (row == data.length - 1 && col == data.length - 1))
                {
                    System.out.print(data[row][col] + " ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }




    public static void main(String[] args) 
    {
        int matrixA[][] = {{3, 5, 9}, {7, 6, 2}, {4, 8, 9}};
        int matrixB[][] = {{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 1, 0}, {0, 0, 0, 1}};
        
        System.out.println("MatricsA");
        printTwoDArray(matrixA);
        System.out.println();

        System.out.println("MatricsB");
        printTwoDArray(matrixB);
        System.out.println();

       /* int result[][] = multiplicationTwoD(matrixA, matrixB);
        System.out.println("After Multiplication");
        printTwoDArray(result);*/

        System.out.println();
        printBoundaryValues(matrixA);
        System.out.println();
        printBoundaryValues(matrixB);

        System.out.println();
        printCornerValues(matrixB);

        
    }
    
}
