package Visualization_Problems;

public class ReverseString
{
    static void reverse(char[] str)
{
    int left = 0;
    int right = str.length - 1;

    while(left < right)
    {
        char temp = str[left];

        str[left] = str[right];

        str[right] = temp;

        left++;
        right--;
    }
}




    public static void main(String[] args) 
    {
    char[] str = {'a', 'l', 'g', 'o'};

    reverse(str);

    for(int i = 0; i < str.length; i++)
    {
        System.out.print(str[i]);
    }
        
    }
    
}
