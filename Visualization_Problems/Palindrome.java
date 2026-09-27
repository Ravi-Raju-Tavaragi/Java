package Visualization_Problems;

public class Palindrome
{
    static boolean isPalindrome(char[] str)
    {
    int left = 0;
    int right = str.length - 1;

    while(left < right)
    {
        if(str[left] != str[right])
        {
            return false;
        }

        left++;
        right--;
    }

    return true;
}


    public static void main(String[] args)
    {
    char[] str = {'r', 'a', 'd', 'a', 'r'};

    System.out.println(isPalindrome(str));
}
    
}
