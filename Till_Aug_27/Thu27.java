public class Thu27{
    public static void main(String[]args){

        //Type Promotion -- Automatic conversion of smaller data type to larger data type by java before performing an operation
        //Golden Rules
        //1.byte, short and char always promoted to int bfr airthmatic operation
        //2.if opperands are different types, java promotes the smaller type to the widest type in the expression
        //3.The result of the expression is of that promoted type
    
        //demo of byte and byte
        byte a = 10;
        byte b = 20;
        //byte c = a+b; --> wrong, lossy conversion.
        int c = a+b; //Type Promotion
        System.out.println("c:"+c);

        //demo of byte and short
        byte d = 10;
        short e = 12;
        //byte f = a+b; --> wrong, lossy conversion
        int f = d-e;
        System.out.println("f:"+f);

        //short and short
        short g = 50;
        short h = 100;
        // short i = 100+50; --->wrong
        int i = g+h;
        System.out.println("i:"+i);

        //short and int 
        short j = 15;
        int k = 20;
        // short l = j+k; --> wrong int larger data type
        int l = j+k;
        System.out.println("l:"+l);

        //double and float
        double m = 10.1225;
        float n = 10.522F;
        // float o = m+n; --> double is larger datatype and lossy conversion
        double o = m+n;
        System.out.println("o:"+o);

        // double and long 
        double a1 = 10.0111;
        long a2 = 1000;
        //long = a1+a2; -->wrong long ignores decimal value 
        double a3 = a1+a2;
        System.out.println("a3:"+a3);

        // int and long 
        int b1 = 10;
        long b2 = 100L;
        //int = b1+b2; --> long is larger than int
        long b3 = b1+b2;
        System.out.println("b3:"+b3);

        //char and int
        char c1 = 'A';
        int c2 = 10;
        //char c3 = c1+c2;
        int c3 = c1+c2;
        System.out.println("c3:"+c3);

        //char and char
        char d1 = 'A'; // input as ascii value of capital A
        char d2 = 'a'; // input as ascii value of small a
        //char d3 = d1+d2; --->Wrong lossy convession error
        int d3 = d1+d2;
        System.out.println("d3:"+d3);

        //byte and char
        byte e1 = 10;
        char e2 = 'A';
        // byte e3 = e1+e2; --> wrong lossy conversion
        int e3 = e1 + e2;
        System.out.println("e3:"+e3);

        //short and char
        short f1 = 10;
        char f2 = 'A';
        // short f3 = f1+f2; ---> wrong, lossy conversion
        int f3 = f1 + f2;
        System.out.println("f3:"+f3);

        //float and int 
        float g1 = 10.114f;
        int g2 = 10;
        // int g3 = g1 + g2;--> int ignores floating numbers
        float g3 = g1 + g2;
        System.out.println("g3:"+g3);

        //string char
       /*  String h1 = "ab"; cannot convert string into int
        char h2 = 'A';

        int h3 = h1 + h2;
        System.out.println(h3); */



    }
    
}
