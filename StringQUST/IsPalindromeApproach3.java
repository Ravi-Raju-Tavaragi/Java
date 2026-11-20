package StringQUST;


//problem : valid Palindrome
//approach 3 : using string and two pointers 
//class used : String
//Reason : only travarsal is required no extra  objects
//Time Complexity : O(n)
//Space Complexity : O(1)
public class IsPalindromeApproach3 
{
    //test one input string
    public static void testPalindrome(String input)
    {
        boolean answer = isPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Output : " + answer);
        System.out.println();
    }

    public static boolean isPalindrome(String input)
    {
        input = input.toLowerCase();

        int left = 0;
        int right = input.length() - 1;

        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(left))
            {
                left++;
            }
            while(left < right && !Character.isLetterOrDigit(right))
            {
                right--;
            }

            if(input.charAt(left) != input.charAt(right))
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
