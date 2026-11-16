package StringQUST;

public class SpecialCharCount
{
    public static void countSpecialChar(char[] special, String specialstring)
    {
        int specialCharCount = 0;
        for(int i = 0; i < special.length; i++)
        {
            if(!((special[i] >= 'A' || special[i] <= 'Z') || 
            (special[i] >= 'a' || special[i] <= 'z') || 
            (special[i] >= '0' || special[i] <= '9') || 
            (special[i] == ' ')))
            {
                specialCharCount++;
            }
        }
        System.out.println("special character count in char array : " + specialCharCount);

        System.out.println();

        /*int specialstringCount = 0;
        for(int i = 0; i < specialstring.length(); i++)
        {
          if(!((specialstring.charAt(i) >= 'A' || specialstring.charAt(i) <= 'Z') || 
            (specialstring.charAt(i) >= 'a' || specialstring.charAt(i) <= 'z') || 
            (specialstring.charAt(i) >= '0' || specialstring.charAt(i) <= '9') || 
            (specialstring.charAt(i) == ' ')))
            {
                specialstringCount++;
            }
        }
        System.out.println("special String character count in char array : " + specialstringCount);*/
    }


    public static void main(String[] args) 
    {
        char[] special = {'/', ' ', '@', '#', '$', 'a'};
        String specialstring = "@#!%^&RAvi"; 
        countSpecialChar(special, specialstring);
        
    }
    
}
