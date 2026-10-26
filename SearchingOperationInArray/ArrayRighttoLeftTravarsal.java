package SearchingOperationInArray;

public class ArrayRighttoLeftTravarsal 
{
    // count even number positions
    static int countEvenNumbers(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return -1;

        int evendigitcount = 0;

        for(int i = nums.length - 1; i >= 0; i--)
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


    //first negative number
    static int firstNegativeNumber(int[] nums)
    {
        
        if(nums == null || nums.length == 0)
            return -1;

        for(int i = nums.length - 1; i >= 0; i--)
        {
            if(nums[i] < 0)
                return nums[i];

        }

        return 0;

    }

    static int lasttPositiveNumber(int[] nums)
    {
        
        if(nums == null || nums.length == 0)
            return -1;

        int lastnum = nums[0];
        if(lastnum < 0)
        {
            for(int i = nums.length - 1; i >= 0; i--)
            {
                if(nums[i] > 0)
                    lastnum = nums[i];
            }
            return lastnum;
        }
        else
            return lastnum;
    }


    //reverse copy
    static int[] reverseArray(int[] array)
    {
        if(array == null || array.length == 0)
            return new int[] {0};
        int newarray[] = new int[array.length]; 
        int j = 0;
        for(int i = array.length - 1; i >= 0; i--)
        {
            newarray[j] = array[i];
            j++;
        }

        return newarray;
    }

    public static void main(String[] args) 
    { 
        int[] array = {12, -345, 2, 6, 7896, 12};
        System.out.println(countEvenNumbers(array));

        int[] array1 = {-12, -345, 2, 6, -7896, 12};
        System.out.println(firstNegativeNumber(array1));

        System.out.println(lasttPositiveNumber(array1));

        int[] array2 = {0, 2, 1, 5, 3, 4};

        int result[] = reverseArray(array2);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }


    }
    
}
