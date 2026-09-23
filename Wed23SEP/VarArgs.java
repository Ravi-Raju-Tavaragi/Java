package Wed23SEP;

public class VarArgs
{
    static void show(int...a)
    {
        System.out.println("No args");

        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i]);

        if(i != a.length-1)
        {
            System.out.print(",");
        }
        }
    }

    /*static void show(int a)
    {
        System.out.println("one argument");
    }

    static void show(int a, int b)
    {
        System.out.println("Two argument");
    }*/





    public static void main(String[] args)
    {
        show();
        show(15);
        show(15, 16);
        show(15,16,17,18);

    }
    
}
