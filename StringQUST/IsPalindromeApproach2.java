package StringQUST;

//1 leetcode125 approach2
// build clean string using string builder
// avoid creating multiple string objects while cleaning
// TC : O(n)
// SC : 
public class IsPalindromeApproach2 
{
    //test one input string
    public static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + answer);
        System.out.println();
    }

    //logic here ----- return true if palindrome 
    public static boolean isPalindrome(String input)
    {
        //convert to lower case
        input = input.toLowerCase();

        //use string builder to avoid creating new string append()
        StringBuilder cleaned = new StringBuilder();

        for(int i = 0; i < input.length(); i++)
        {
            char currentChar = input.charAt(i);
            
            if(Character.isLetterOrDigit(currentChar))//Character is inbuilt class that has method and class
            {
                cleaned.append(currentChar);
            }
        }
         StringBuilder reverseBuilder = new StringBuilder(cleaned);
         reverseBuilder.reverse();
        //compare
        return cleaned.toString().equals(reverseBuilder.toString());
    }




    public static void main(String[] args) 
    {
        //different input test
        testPalindrome("madam");
        testPalindrome("rececar");
        testPalindrome("hello");
        testPalindrome("A man, a plan, a canal: Panama");
        testPalindrome("race a car");
        testPalindrome("121");
        testPalindrome("A@#%fdd");
        testPalindrome("");
        
    }
    
}


/*
char currentChar = input.charAt(left);
            char currentChar1 = input.charAt(right);

            if(Character.isLetterOrDigit(currentChar) && Character.isLetterOrDigit(currentChar1))
            {
                if(currentChar == currentChar1)
                {
                    return true;
                }
                left++;
                right--;
            }
*/