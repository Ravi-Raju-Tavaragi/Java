package Fri28;

public class ClassWork
{
        public static void main(String[]args)
        {
            int a = 10;
            int b = 20;
            int c = 30;
            int d = 40;
            int e = 50;
            int temp;
            
            System.out.println("Numbers Before swap using extra memory");
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c:"+c);
            System.out.println("d:"+d);
            System.out.println("e:"+e);

            temp = a;
            a = b;
            b = c;
            c = d;
            d = e;
            e = temp;

            System.out.println("Numbers After swap using extra memory");
            System.out.println("a:"+a);
            System.out.println("b:"+b);
            System.out.println("c:"+c);
            System.out.println("d:"+d);
            System.out.println("e:"+e);

        }
}
