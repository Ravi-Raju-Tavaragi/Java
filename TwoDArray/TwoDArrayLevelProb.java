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

    public static boolean searchElement(int[][] matrix, int searchElement)
    {
        if(matrix == null)
            System.out.println("Array null");

        boolean elementFound = false;
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(searchElement == matrix[row][col])
                {
                    elementFound = true;
                    return elementFound;
                }
            }
        }
        return false;
    }


    public static boolean searchDioganalElement(int matrix[][], int searchElement)
    {
        if(matrix == null)
            System.out.println("Array null");


        boolean elementFound = false;
        for(int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[row].length; col++)
            {
                if(row == col)
                {
                    if(searchElement == matrix[row][col])
                    {
                        elementFound = true;
                        return elementFound;
                    }
                }
            }
        }
        return false;
    }

    public static void swapTwoDArray(int matrix[][])
    {
        if(matrix == null)
            System.out.println("Array null");

        for(int row = 0; row < matrix.length; row++)
        {
            int left = 0;
            int right = matrix[row].length - 1;

            while(left < right)
            {
                int temp = matrix[row][row];
                matrix[row][row] = matrix[row][matrix[row].length - 1];
                matrix[row][matrix[row].length - 1] = temp;

                left++;
                right--;
            }
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

        System.out.println();
        int search = 8;
        boolean result = searchElement(array, search);
        System.out.println(result);

        System.out.println();
        int search1 = 8;
        boolean result1 = searchDioganalElement(array, search1);
        System.out.println(result1);

    }
    
}
