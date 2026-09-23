package Wed23SEP;

public class KeyCount
{
    static int countKey(int ... nums)
    {
        int count = 0;

        for(int n : nums)
        {
            if(n == 20)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        System.out.println("Key Count is : "+ countKey(20, 10, 20, 30, 20, 40, 20));
    }
    
}
