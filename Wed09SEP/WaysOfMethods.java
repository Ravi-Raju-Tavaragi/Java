package Wed09SEP;

public class WaysOfMethods
{

    //no arguments no return
    static void greet()
    {
        System.out.println("Hi");
    }

    //argument but no return
    static void printSum(int a, int b)
    {
        System.out.println("sum ="+(a+b));
    }

    //no argument but return
    static int getNumber()
    {
        return 100;
    }

    //argument and return
    static int max(int x, int y)
    {
        if(x>y)
            return x;
        else
            return y;
    }
    public static void main(String[] args) 
    {
        
    }
    
}
