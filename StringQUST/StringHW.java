package StringQUST;

public class StringHW
{
    public static void oddCharStr(char name[], String str)
    {
        for(int i = 1; i < name.length; i+=2)
        {
            System.out.print(name[i] + " " + i + ", ");
        }

        System.out.println();
        //for string
        for(int i = 1; i < str.length(); i+=2)
        {
            System.out.print(str.charAt(i) + " " + i + ", ");
        }
    }

    public static void asciiValue()
    {
        char[] digits = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        String str = "0123456789";

        for(int i = 0; i < digits.length; i++)
        {
            System.out.print(digits[i]);
        }

        System.out.println();
        //for string
        for(int i = 0; i < str.length(); i++)
        {
            System.out.print(str.charAt(i));
        }
    }



    public static void main(String[] args) 
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I'};
        String str = "HELLORAVI";
        
        oddCharStr(name, str);
        asciiValue();
    }
    
}
