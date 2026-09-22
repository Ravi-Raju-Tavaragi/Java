package Tue22SEP;

public class AvgofArrayElement
{
    int findSum(int[] arr)
    {
        int sum = 0;
        int avg;

        for(int var : arr)
        {
            //sum += var;
            sum = sum + var;
        }
        
        avg = sum / arr.length;
        return avg;
    }



    public static void main(String[] args) 
    {
        int[] arr = {1, 3, 5, 7};

        AvgofArrayElement obj = new AvgofArrayElement();

        System.out.println(obj.findSum(arr));
        
    }
    
}
