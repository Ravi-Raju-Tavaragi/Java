package Mon31;

import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        float base, hight, area;
        System.out.println("Enter base of Triangle");
        base = sc.nextFloat();
        System.out.println("Enter hight of Triangle");
        hight = sc.nextFloat();
        area = ((0.5F)*(base*hight));
        System.out.println("Area of Triangle is :"+area);
        sc.close();
        


    }
}
