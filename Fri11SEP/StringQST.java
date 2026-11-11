package Fri11SEP;

public class StringQST
{
    // 1. Find string length
    static int findLength(String str)
    {
        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            count++;
        }

        return count;
    }




    public static void main(String[] args) 
    {
        String str = "madam";
        String text = "I love Java";

        System.out.println("1. Length: " + findLength(str));
        
    }
    
}
