package Fri11SEP;

public class HWString
{
    public static void countCharacterFrequency(String str)
{
    for(int i = 0; i < str.length(); i++)
    {
        int count = 1;
        boolean alreadyCounted = false;

        for(int j = 0; j < i; j++)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                alreadyCounted = true;
                break;
            }
        }

        if(alreadyCounted)
        {
            continue;
        }

        for(int j = i + 1; j < str.length(); j++)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                count++;
            }
        }

        System.out.println(str.charAt(i) + " = " + count);
    }
}


public static char firstNonRepeatingCharacter(String str)
{
    for(int i = 0; i < str.length(); i++)
    {
        int count = 0;

        for(int j = 0; j < str.length(); j++)
        {
            if(str.charAt(i) == str.charAt(j))
            {
                count++;
            }
        }

        if(count == 1)
        {
            return str.charAt(i);
        }
    }

    return '\0';
}


public static String replaceSpaces(String str)
{
    String result = "";

    for(int i = 0; i < str.length(); i++)
    {
        if(str.charAt(i) == ' ')
        {
            result = result + "%20";
        }
        else
        {
            result = result + str.charAt(i);
        }
    }

    return result;
}


    public static void main(String[] args) 
    {
        
    }
    
}
