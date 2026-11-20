package StringQUST;

public class HWString
{
     // 1. Extract username and domain from email
    public static void extractEmail(String email)
    {
        int index = email.indexOf('@');

        if(index == -1)
        {
            System.out.println("Invalid Email");
            return;
        }

        String username = email.substring(0, index);
        String domain = email.substring(index + 1);

        System.out.println("Username: " + username);
        System.out.println("Domain: " + domain);
    }


    // 2. Check Binary number
    public static boolean isBinary(String str)
    {
        return str.matches("[01]+");
    }


    // 3. Check Hexadecimal number
    public static boolean isHexadecimal(String str)
    {
        return str.matches("[0-9A-Fa-f]+");
    }


  
    // 5. Remove special characters
    public static String removeSpecialCharacters(String str)
    {
        return str.replaceAll("[^a-zA-Z0-9 ]", "");
    }


    // 6. Remove extra spaces
    public static String removeExtraSpaces(String str)
    {
        return str.trim().replaceAll("\\s+", " ");
    }


    public static void main(String[] args) 
    {

        
        
    }
    
}
