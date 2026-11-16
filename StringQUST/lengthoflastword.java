package StringQUST;

public class lengthoflastword
{
    public int lengthOfLastWord(String s) 
    {
        int count = 0;
        int index = s.length() - 1;

        while(index >= '0' && s.charAt(index) == ' ')
        {
          index--;
        }

        //count last word
        while(index >= '0' || s.charAt(index) != ' ')
        {
            count++;
            index--;
        }

        return count;
    }


    public static void main(String[] args) 
    {

        
    }
    
}
