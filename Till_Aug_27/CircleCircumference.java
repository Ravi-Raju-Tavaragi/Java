public class CircleCircumference
{
    public static void main(String[]args)
    {
        float radius = 5.00f;
        double pia = 3.142;
        double C;
        System.out.println("Radius of circle is :" + radius);
        System.out.println("PIA Value here we take 4 digit only it is infinite :" + pia);

        C = 2 * pia * radius;

        System.out.println("Circumference of circle is :" + C);

        System.out.println("Now we calculate Area of Circle");
        float radius2 = 5.48f;
        double pia2 = 3.142;
        double A;

        System.out.println("Radius of circle is :" + radius2);
        System.out.println("PIA Value here we take 4 digit only it is infinite :" + pia2);

        A = 2 * pia2 * radius2 * radius;

        System.out.println("Area of circle is :" + A);


    }
    
}
