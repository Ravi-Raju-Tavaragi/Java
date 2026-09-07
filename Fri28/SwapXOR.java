package Fri28;

public class SwapXOR {
    public static void main(String[]args)
    {
            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;
            
            System.out.println("Numbers Before swap using extra memory");
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c:"+c);
            System.out.println("d:"+d);
            
            a = a ^ b;
            b = a ^ b;
            a = a ^ b;

            c = c ^ d;
            d = c ^ d;
            c = c ^ d;

            System.out.println("Numbers After swap using extra memory");
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c:"+c);
            System.out.println("d:"+d);
            
    }
}
