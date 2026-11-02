package TwoDArray;

public class TwoDArray0211
{
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

    public static void printrow(int[][] data, int rowNumber)
    {
        if(data == null)
            return ;

        if(rowNumber <= 0 || rowNumber > data.length)
            return ;

        for(int row = rowNumber - 1; row < data.length;)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                System.out.print(data[row][col]+" ");
            }
            System.out.println();
            break;
        }
    }

    public static void printrowSingleLoop(int[][] data, int rowNumber)
    {
        if(data == null)
            return ;
        
        if(rowNumber <= 0 || rowNumber > data.length)
        {
            System.out.println("Invalid Row Number");
            return ;
        }

        System.out.println();
        for(int col = 0; col < data[rowNumber - 1].length; col++)
        {
            System.out.print(data[rowNumber - 1][col] + " ");
        }
    }

    public static void printColSingleLoop(int[][] data, int colNumber)
    {
        if(data == null)
            return ;
        
        if(colNumber <= 0 || colNumber > data.length)
        {
            System.out.println("Invalid col Number");
            return ;
        }

        System.out.println();
        for(int row = 0; row < data[colNumber - 1].length; row++)
        {
            System.out.print(data[row][colNumber - 1] + "\n");
        }
    }


    public static void main(String[] args) 
    {
        int data[][] = {{11, 12, 13, 14, 15}, 
                        {21, 22, 23, 24, 25}, 
                        {31, 32, 33, 34, 35},
                        {41, 42, 43, 44, 45}, 
                        {51, 52, 53, 54, 55}};

       
       System.out.println();
       printrow(data, 1);
       System.out.println();
       printrowSingleLoop(data, 5);
       System.out.println();
       printColSingleLoop(data, 1);
       
        
    }
    
}
