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

    // 2. Reverse a string
    static String reverseString(String str)
    {
        String reverse = "";

        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }

        return reverse;
    }



    public static void main(String[] args) 
    {
        String str = "madam";
        String text = "I love Java";

        System.out.println("1. Length: " + findLength(str));
        
        System.out.println("2. Reverse: " + reverseString(str));
    }
    
}
