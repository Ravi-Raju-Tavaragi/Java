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



    static char[] concatStrings(char[] str1, char[] str2)
    {
    char[] result = new char[str1.length + str2.length];

    for(int i = 0; i < str1.length; i++)
    {
        result[i] = str1[i];
    }

    for(int i = 0; i < str2.length; i++)
    {
        result[str1.length + i] = str2[i];
    }

    return result;
    }







    public static void main(String[] args) 
    {
        char[] s1 = {'h', 'e', 'l', 'l', 'o'};
        char[] s2 = {'w', 'o', 'r', 'l', 'd'};




        System.out.println("Length of s1: " + getLength(s1));

        System.out.print("Concatenation: ");
        System.out.println(concatStrings(s1, s2));
    }
    
}
