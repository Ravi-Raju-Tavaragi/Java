package Tue22SEP;

public class SecondLargest
{
    int secondLargest(int[] arr)
    {
        int firstlargest = 0;
        int secondlargest = 0;

        for(int x : arr)
        {
            if(x > firstlargest)
            {
                secondlargest = firstlargest;
                firstlargest = x;
            }
            else
            {
                secondlargest = x;
            }
        }
        return secondlargest;
    }




    public static void main(String[] args)
    {
        int[] arr = {10, 20, 15, 30, 35};

        SecondLargest obj = new SecondLargest();

        int res = obj.secondLargest(arr);
        System.out.println("SecondLargest element is : "+res);
        
    }
    
}
