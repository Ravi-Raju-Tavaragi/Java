package StringQUST;

public class ArrayQt
{
    public static boolean containsNearbyDuplicate(int[] nums, int k) 
    {

        if( nums == null || nums.length == 0)
            return false;

        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] == nums[j] && (i - j) <= k)
                {
                    return true;
                }
            }
        }

        return false;

    }
    public static void main(String[] args) 
    {
        int[] nums = new int[]{1, 2, 3, 1, 2, 3};
        int k = 2;

        System.out.println(containsNearbyDuplicate(nums, k));
        
    }
    
}
