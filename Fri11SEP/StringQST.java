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

    // 3. Check palindrome
    static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }

    // 4. Count vowels and consonants
    static void countVowelsConsonants(String str)
    {
        int vowels = 0;
        int consonants = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = Character.toLowerCase(str.charAt(i));

            if(ch >= 'a' && ch <= 'z')
            {
                if(ch == 'a' || ch == 'e' || ch == 'i' ||
                   ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // 5. Count words
    static int countWords(String str)
    {
        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) != ' ' &&
               (i == 0 || str.charAt(i - 1) == ' '))
            {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) 
    {
        String str = "madam";
        String text = "I love Java";

        System.out.println("1. Length: " + findLength(str));
        
        System.out.println("2. Reverse: " + reverseString(str));

        System.out.println("3. Palindrome: " + isPalindrome(str));

        System.out.println("4. Vowels and Consonants:");
        countVowelsConsonants(text);

        System.out.println("5. Word Count: " + countWords(text));
    }
    
}
