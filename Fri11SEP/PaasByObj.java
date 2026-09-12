package Fri11SEP;

public class PaasByObj
{
    static void update(int b[])
    {
        b[0] = 100;

        System.out.println("Inside Update" +b[0]);
    }


    public static void main(String[] args) 
    {

        int a[] = {10, 20, 40, 30};
        System.out.println("Before Method call" +a[0]);


        update(a);

        System.out.println("After call" +a[0]);
        
    }
    
}
