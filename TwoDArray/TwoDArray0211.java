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

        int colIndex = colNumber - 1;

        if(data == null)
            return ;

        System.out.println();
        for(int row = 0; row < data.length; row++)
        {
            if(data[row].length <=  colIndex)
            {
                System.out.print("No Elements");
                continue;
            }
        
            System.out.print(data[row][colIndex] + "\n");
        }
    }

    public static void printDioganal(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
            System.out.print(data[row][row]+"\n");
        }
    }

    public static void printDioganalTwoLoop(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
            for(int col = 0; col < data[row].length; col++)
            {
                if(row == col)
                {
                    System.out.print(data[row][col]+" ");
                }
                else
                {
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }

    public static void secondaryDiagonal(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
            System.out.print(data[row][data.length - 1 - row] + " ");
        }
    }

    public static void printLastColNum(int data[][])
    {
        for(int row = 0; row < data.length; row++)
        {
           int lastelement = data[row].length - 1;
           System.out.print(data[row][lastelement]+"\n");
        }
    }


    public static void main(String[] args) 
    {
        int data[][] = {{11, 12, 13, 14, 15}, 
                        {21, 22, 23, 25}, 
                        {31, 32, 33, 34, 35},
                        {41, 42, 43, 44, 45}, 
                        {51, 52, 53, 54, 55}};

       
       System.out.println();
       printrow(data, 1);
       System.out.println();
       printrowSingleLoop(data, 5);
       System.out.println();
       printColSingleLoop(data, 2);

       System.out.println();
       printColSingleLoop(data, 4);
       
       System.out.println();
       printDioganal(data);
        
       System.out.println();
       printDioganalTwoLoop(data);

       System.out.println();
       printLastColNum(data);

       System.out.println();
       secondaryDiagonal(data);
    }
    
}
