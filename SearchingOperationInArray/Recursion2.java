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
    
    static int count(int M)
    {
        int funcount = 1;
       
        if(M > 0)
        {
            count(M - 1);
            funcount = funcount + 1;
        }

        return funcount;
    }

    static int sum(int n)
    {
        if(n == 0)
            return 0;

        return n + sum(n-1);
    }


    static int factorial(int n)
    {
        if(n == 0)
            return 1;

        return n * factorial(n-1);
    }

    static int power(int n, int M)
    {
        if(M == 0)
            return 1;

        return n * power(n, M - 1);
    }

    

    public static void main(String[] args) 
    {
        fun(3);
        print(1);
        print2(10);
        System.out.println("sum of n numbers : " + sum(5));
        System.out.println("Factorial of n numbers : " + factorial(5));
        System.out.println("Power of Nuber : " + power(2, 5));
        
    }
}