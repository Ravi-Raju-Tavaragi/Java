package SearchingOperationInArray;

public class ArrayConcatinate
{
    public static  int[] getConcatenation(int[] nums) 
    {
        if(nums == null || nums.length == 0)
            return new int[] {0};

        int ans[] = new int[nums.length * 2];

        for(int i = 0; i < nums.length; i++)
        {
            ans[i] = nums[i];
            ans[i + nums.length] = nums[i];
        }

         

        return ans;

        
    }





    public static void main(String[] args) 
    {
        int[] array = {0, 2, 1, 5, 3, 4};

        int result[] = getConcatenation(array);
        for(int i = 0; i < result.length; i++)
        {
            System.out.print(result[i]+", ");
        }
        
    }
    
}
