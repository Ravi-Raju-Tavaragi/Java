package StringQUST;

public class CountOccurances
{
    public static void countOccurance(char[] name, char target)
    {
        int count = 0;
        for(int i = 0; i < name.length; i++)
        {
            if(name[i] == target)
            {
                count++;
            }
        }

        System.out.println(count);
    } 

    public static void largestChar(char[] name)
    {
        char largest = name[0];

        for(int i = 1; i < name.length; i++)
        {
            if(largest < name[i])
            {
                largest = name[i];
            }
        }

        System.out.println("Largest char in array is : "+largest);
    }

    public static void largestCharString(String name)
    {

        char largest = name.charAt(0);

        for(int i = 1; i < name.length(); i++)
        {
            if(largest < name.charAt(i))
            {
                largest = name.charAt(i);
            }
        }

        System.out.println("Largest char in array is : "+largest);
    }



    public static void main(String[] args) 
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I', '1', '2'};
        String str = "RAVIHI12z";
        char target = 'I';

        countOccurance(name, target);
        largestChar(name);
        largestCharString(str);

        
    }
    
}
