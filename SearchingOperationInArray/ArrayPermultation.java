package SearchingOperationInArray;

public class ArrayPermultation
{
    public static int[] buildArray(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return new int[] {0};

        int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[nums[i]];
        }

        return ans;
    }


    public static void main(String[] args) 
    {
        int[] array = {0, 2, 1, 5, 3, 4};

        int result[] = buildArray(array);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }
        
    }
    
}
