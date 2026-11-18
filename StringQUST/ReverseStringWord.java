package StringQUST;

public class ReverseStringWord
{
    public String reverseWords(String s) 
    {
        char[] charArray = s.toCharArray();

        int start = 0;

        for (int end = 0; end <= charArray.length; end++) {

            if (end == charArray.length || charArray[end] == ' ') {

                int left = start;
                int right = end - 1;

                while (left < right) {

                    char temp = charArray[left];

                    charArray[left] = charArray[right];

                    charArray[right] = temp;

                    left++;
                    right--;
                }

                start = end + 1;
            }
        }

        return new String(charArray);
    }


    public static void main(String[] args) 
    {

        
    }
    
}
