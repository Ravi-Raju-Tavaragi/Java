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
        System.out.println();
        String str = "0123456789";

        for(char digit = '0'; digit <= '9'; digit++)
        {
            System.out.println(digit + " = " + (int) digit);
        }

        System.out.println();
        //for string
        for(char i = 0; i < str.length(); i++)
        {
            System.out.println((int)str.charAt(i) + " " + str.charAt(i));
        }
    }

    public static void count()
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I', '1', '2'};
        String str = "HELLORAVI12";

        int charUpperCasecount = 0;
        int charLowerCasecount = 0;
        int charDigitCount = 0;

        for(int i = 0; i < name.length; i++)
        {
           if(name[i] >= 'A' && name[i] <= 'Z')
           {
                charUpperCasecount++;
           }
           else if(name[i] >= 'a' && name[i] <= 'z')
           {
                charLowerCasecount++;
           }

           if(name[i] >= '0' && name[i] <= '9')
           {
                charDigitCount++;
           }
        }
        System.out.println(charUpperCasecount +" " + charLowerCasecount +" " + charDigitCount);

    }



    public static void main(String[] args) 
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I'};
        String str = "HELLORAVI";
        
        oddCharStr(name, str);
        asciiValue();
        count();
    }
    
}
