package TwoDArray;

public class TwoDArrayLevelProb
{
    public static void maxelementinEachRow(int[][] matrix)
    {
        if(matrix == null)
            System.out.println("Array null");

        
        for(int row = 0; row < matrix.length; row++)
        {
            int max = matrix[row][0];
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(max < matrix[row][col])
                {
                    max = matrix[row][col];
                }
            }
            System.out.println(max+" ");
        }
    }


    public static void maxANDminelementinEachRow(int[][] matrix)
    {
        if(matrix == null)
            System.out.println("Array null");

        
        for(int row = 0; row < matrix.length; row++)
        {
            int max = matrix[row][0];
            int min = matrix[row][0];
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(max < matrix[row][col])
                {
                    max = matrix[row][col];
                }

                if(min > matrix[row][col])
                {
                    min = matrix[row][col];
                }
            }
            System.out.println(max + " MAX " + min + " MIN ");
        }
    }

    public static void minEvenElement(int[][] matrix)
    {
        if(matrix == null)
            System.out.println("Array null");

        
        for(int row = 0; row < matrix.length; row++)
        {
            int evenMin = matrix[row][0];
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(evenMin > matrix[row][col])
                {
                    if( matrix[row][col] % 2 == 0)
                    {
                        evenMin = matrix[row][col];
                    }
                }
            }
            System.out.println( evenMin + " MIN ");
        }
    }

    public static void scalarMultiply(int[][] matrix, int scalar)
    {
        if(matrix == null)
            System.out.println("Array null");

        
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                System.out.print(matrix[row][col] * (scalar) + " ");
            }
            System.out.println();
        }
    }

    public static void printDioganalTwoLoop(int matrix[][], int scalar)
    {
        if(matrix == null)
            System.out.println("Array null");


        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(row == col)
                {
                    System.out.print(matrix[row][col] * (scalar) +" ");
                }
                else
                {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }








    public static void main(String[] args) 
    {
        int[][] array = {{3, 5, 9}, {7, 6, 2}, {4, 8, 9}};
        maxelementinEachRow(array);
        
        System.out.println();
        maxANDminelementinEachRow(array);

        System.out.println();
        minEvenElement(array);

        System.out.println();
        int scalar = -1;
        scalarMultiply(array, scalar);

        System.out.println();
        int scalar2 = 10;
        printDioganalTwoLoop(array, scalar2);

    }
    
}
