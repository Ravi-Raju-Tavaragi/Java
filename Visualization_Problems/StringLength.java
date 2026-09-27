package Visualization_Problems;

public class StringLength
{
    static int getLength(char[] str)
    {
    int count = 0;

    for(int i = 0; i < str.length; i++)
    {
        count++;
    }

    return count;
}




    public static void main(String[] args) 
    {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("Length of s1: " + getLength(s1));

        
    }
    
}
