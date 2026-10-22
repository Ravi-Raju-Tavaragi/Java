package SearchingOperationInArray;

public class Recursion2
{
    static void fun(int n)
    {
       if(n > 0)
       {
            System.out.println("Enter : "+n);

            fun(n-1);

            System.out.println("Exit : "+n);
       }
    }

    static void print(int i)
    {
        if(i > 5)
        {
            return ;
        }

        System.out.println(i);
        print(i+1);
    }


    static void print2(int N)
    {
        if(N < 1)
        {
            return ;
        }

        System.out.println(N);
        print2(N-1);
    }
    

    public static void main(String[] args) 
    {
        fun(3);
        print(1);
        print2(10);
    }
}