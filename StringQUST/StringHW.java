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




    public static void main(String[] args) 
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I'};
        String str = "HELLORAVI";
        
        oddCharStr(name, str);
    }
    
}
