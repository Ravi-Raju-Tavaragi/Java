package Wed23SEP;

public class CountEven
{
    static int evenCount(int ... nums)
    {
        int count = 0;

        for(int n : nums)
        {
            if(n % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args)
    {
        System.out.println("Even Number Count is : "+evenCount(10,25,33,40,50));
    }
    
}
