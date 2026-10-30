package TwoDArray;

public class Print2DArray
{
    public static void main(String[] args) 
    {
        int[] [] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for(int i = 0; i < a.length; i++)  // access to references a[0],a[1]......
        {
            for(int j = 0; j < a[i].length; j++) // access the elements
            {
                System.out.print(a[i][j]+ " "); 
            }
            System.out.println();
        }
        

        // using for each

        for(int x : a)
        {
            for(int y : a[i])
            {
                System.out.print();
            }
        }
    }
    
}
