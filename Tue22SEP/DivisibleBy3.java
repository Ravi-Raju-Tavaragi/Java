package Tue22SEP;

public class DivisibleBy3
{
     void printDivisibleBy3(int[] numbers) 
     {
        for (int num : numbers)
        {
            if (num % 3 == 0) 
            {
                System.out.println(num);
            }
        }
    }




    public static void main(String[] args) 
    {
        int[] numbers = {10, 12, 15, 7, 9, 20, 6, 11};

        DivisibleBy3 obj = new DivisibleBy3();

        obj.printDivisibleBy3(numbers);
        
    }
    
}
