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




    public static void main(String[] args) 
    {
        
    }
    
}
