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

    // leetcode 557
    public static void reverseWords()
    {
        char[] temp = {'R', 'A', 'V', 'I', ' ', 'H', 'I', ' ', '1', '2'};

        int start = 0;

        for(int end = 0; end < temp.length; end++)
        {
            if(end == temp.length || temp[end] == ' ')
            {
                int left = start;
                int right = end - 1;

                while(left < right)
                {
                    char temp1 = temp[left];
                    temp[left] = temp[right];
                    temp[right] = temp1;

                    left++;
                    right--;
                }
                start = end + 1;
            }
        }

        System.out.println(temp);
    }


    public static void main(String[] args) 
    {

        reverseWords();
        
    }
    
}
