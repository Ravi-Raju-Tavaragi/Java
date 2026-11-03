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








    public static void main(String[] args) 
    {
        int[][] array = {{3, 5, 9}, {7, 6, 2}, {4, 8, 9}};
        maxelementinEachRow(array);
        
    }
    
}
