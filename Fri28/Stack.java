package Fri28;

public class Stack 
{

    static void A() //go inside the A
    {
        B(); //here we call B and program looking for B
    }

    static void B() //go inside B
    {
        C(); // here we call C it look for C
    }

    static void C() // go inside C
    {
        System.out.println("Hello"); //here C prints the Hello Than Stack prints main Hello
    }
    public static void main(String[]args)
    {
        A();//call A, main go to top
    }
}
