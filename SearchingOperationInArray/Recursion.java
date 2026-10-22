package SearchingOperationInArray;

public class Recursion
{
    public static void fun(int n)
    {
        if(n > 0)
        {
            fun(n-1);//call
            System.out.println(n);//work
            fun(n - 1);//call
        }
    }



    public static void main(String[] args) 
    {
        fun(3);
        
    }
    
}
