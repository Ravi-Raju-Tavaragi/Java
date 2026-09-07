public class ClassWork26
{
    public static void main(String[]args)
    {
        // Integer division and Floating division
        System.out.println(58/6);// it gives output and perform division but ignores flaoting values only gives int type 
        System.out.println(10.5000/10); // it perform division and prints ans it consider double 

        int a1 = 15; // perform division after in output ignores decimal value and give whole number in output because we declare result in int
        int a2 = 10;
        int a3;

        a3 = a1 / a2;

        System.out.println("Result a3 :" +a3);

        double b1 = 10.5;// result datatype is double so it gives complete output
        int b2 = 2;
        double b3;

        b3 = b1 / b2;
        System.out.println("Result b3 :" +b3);

    }
    
}
