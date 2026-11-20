package StringQUST;


//problem : valid Palindrome
//approach 1 : reverse string
//class used : StringBuilder
//Reason : StringBuilder provides reverse method
// Easy to understand logic
// good starting approach for beginers
//Time Complexity :
//Space Complexity :
public class IsValidPalindromeLeetCode125
{
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

        //step 2 keep only letters and digit
        //ignore spaces, comma fullstop colan etc
        String cleaned = "";

        for(int i = 0; i < input.length(); i++)
        {
            char currentChar = input.charAt(i);
            
            if(Character.isLetterOrDigit(currentChar))//Character is inbuilt class that has method and class
            {
                cleaned = cleaned + currentChar;
            }
        }

        //reverse the cleaned string
        StringBuilder builder = new StringBuilder(cleaned);

        String reverse = builder.reverse().toString();

        //compare
        return cleaned.equals(reverse);
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
