package TwoDArray;

public class TwoDArrayMultiplication
{
    public static int[][] multiplicationTwoD(int matrixA[][], int matrixB[][])
    {
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



    public static void main(String[] args) 
    {
        int matrixA[][] = {{3, 5, 9}, {7, 6, 2}, {4, 8, 9}};
        int matrixB[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        
        System.out.println("MatricsA");
        printTwoDArray(matrixA);
        System.out.println();

        System.out.println("MatricsB");
        printTwoDArray(matrixB);
        System.out.println();

        int result[][] = multiplicationTwoD(matrixA, matrixB);
        System.out.println("After Multiplication");
        printTwoDArray(result);


        
    }
    
}
