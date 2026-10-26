package SearchingOperationInArray;

public class NumberSmallerThanCurrentNum
{
    static int[] smallestNumberThanCurrent(int[] nums)
    {
        if(nums == null || nums.length == 0)
            return new int[] {0};


        int[] newArray = new int[nums.length];
        int k = 0;

        for(int i = 0; i < nums.length; i++)
        {
            int count = 0;
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[j] != nums[i] && nums[j] < nums[i])
                    count++;
            }
            newArray[k] = count;
            k++;
        }

        return newArray;
    }




    public static void main(String[] args) 
    {
        int[] array = {6, 5, 4, 8};

        int result[] = smallestNumberThanCurrent(array);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }
        
    }
    
}
