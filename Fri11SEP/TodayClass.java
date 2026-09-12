package Fri11SEP;

public class TodayClass
{
    static void basicSalary()
    {
        System.out.println("Basic salary done");
    }


    static void calculatePF()
    {
        basicSalary();
        System.out.println("PF done");

    }

    static void calculateHRA()
    {
        calculatePF();
        System.out.println("HRA done");
    }


    static void calculateDa()
    {
        calculateHRA();
        System.out.println("Da done");
    }

    static void calculateTax()
    {
        calculateDa();
        System.out.println("Tax done");
    }

    static void calculateSalary()
    {
        calculateTax();
        System.out.println("Final salary");
    }


    public static void main(String[] args) 
    {
        calculateSalary();
        
    }
    
}
