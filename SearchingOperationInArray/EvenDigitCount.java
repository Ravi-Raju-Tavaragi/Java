package SearchingOperationInArray;

public class EvenDigitCount
{
    static int countEvenNumbers(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return -1;

        int evendigitcount = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int digit = nums[i];
            int count = 0;

            if(digit == 0)
            {
                count = 1;
            }
            else 
            {
                while(digit != 0)
                {
                    digit = digit / 10;
                    count++;
                }
                if(count % 2 == 0)
                    evendigitcount++;
            }
        }
        return evendigitcount;
    }


    public static void main(String[] args) 
    {
        int[] array = {12, 345, 2, 6, 7896, -12};
        System.out.println(countEvenNumbers(array));

        
    }
    
}
