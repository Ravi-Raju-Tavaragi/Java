package Wed23SEP;

public class VarArgs
{
    static void showw()
    {
        System.out.println("No args");
    }

    static void show(int a)
    {
        System.out.println("one argument");
    }

    static void show(int a, int b)
    {
        System.out.println("Two argument");
    }





    public static void main(String[] args)
    {
        showw();
        show(15);
        show(15, 16);

    }
    
}
