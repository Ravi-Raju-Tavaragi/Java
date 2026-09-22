package Tue22SEP;

public class CountPosNegZero
{
    void countNumbers(int[] numbers) 
    {

        int positive = 0;
        int negative = 0;
        int zero = 0;

        for (int num : numbers) 
        {
            if (num > 0) 
            {
                positive++;
            } 
            else if (num < 0) 
            {
                negative++;
            } 
            else 
            {
                zero++;
            }
        }

        System.out.println("Positive numbers: " + positive);
        System.out.println("Negative numbers: " + negative);
        System.out.println("Zeros: " + zero);
    }



    public static void main(String[] args) 
    {
        int[] numbers = {10, -5, 0, 20, -8, 0, 15, -2};

        CountPosNegZero obj = new CountPosNegZero();
        obj.countNumbers(numbers);
        
    }
    
}
