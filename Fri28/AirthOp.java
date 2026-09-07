package Fri28;

public class AirthOp 
{
    public static void main(String[]args)
    {
        int num1 = 10;
        int num2 = 30;
       

        System.out.println("Num1 :"+num1);
        System.out.println("Num2 :"+num2);

        System.out.println("1.Addition(+) = Num1 + Num2 :"+ (num1+num2));
        System.out.println("2.Substraction(-) = Num1 - Num2 :"+ (num1-num2));
        System.out.println("3.Multiplication(*) = Num1 * Num2 :"+ (num1*num2));
        System.out.println("4.Division(/) = Num1 / Num2 :"+ (num1/num2));
        System.out.println("5.Modolus(%) = Num1 % Num2 :"+ (num1%num2));

        //integer vs float
        int a1 = 10;
        double a2 = 20;
        System.out.println("1.Division(/) = a1 / a2 :"+ (a1/a2));
        System.out.println("2.Modolus(%) = a1 % a2 :"+ (a1%a2));

        //precedence
        System.out.println("Precedence a1+a2*num1 = " + (a1+a2*num1));
        System.out.println("Precedence (a1+a2)*num1 = " + ((a1+a2)*num1));
        System.out.println("Precedence a1-a2+num1 = " + (a1-a2+num1));
        System.out.println("Precedence a1+(a2*num1) = " + (a1+(a2*num1)));

        //boolean
       /*boolean x = true;
        boolean y = false;
        System.out.println("X+Y =" + (x+y)); // Boolean Does not work in Java For Airhmatic Operations
        System.out.println("X-Y =" + (x-y));
        System.out.println("X*Y =" + (x*y));
        System.out.println("X/Y =" + (x/y));
        System.out.println("X%Y =" + (x%y));*/ 

        //unary
        System.out.println("unary of a1:"+(++a1));
        System.out.println("unary of a1:"+(--a1));
        System.out.println("unary of Num1:"+(++num1));
        System.out.println("unary of Num1:"+(--num2));

        float b1 = 20.5f;
        float b = 3.6f;
        System.out.println("float vs int:"+(b1/b));
        System.out.println("float vs int Num1:"+(b1%b));

        double C1 = 20.5;
        double c2 = 3.6;
        
        System.out.println("float vs int:"+(C1/c2));
        System.out.println("float vs int Num1:"+(C1%c2));

        double n = 8.1;
        int integer = (int) n;
        double fraction = n - integer;
        System.out.print(Integer.toBinaryString(integer)+fraction);


   


    }
}
