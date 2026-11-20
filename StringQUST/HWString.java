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

    // 7. Check valid date format
    public static void isValidDate()
    {
        String date1 = "01*12*2000";
        String date2 = "01/12/2000";

        System.out.println("Is Valid Date : "+date1.matches("[0-3][0-9][^a-zA-Z0-9!-.:-@{-~}][0-1][0-9][^a-zA-Z0-9!-.:-@{-~}][1-2][0-9][0-9][0-9]"));
        System.out.println("Is Valid Date : "+date2.matches("[0-3][0-9][^a-zA-Z0-9!-.:-@{-~}][0-1][0-9][^a-zA-Z0-9!-.:-@{-~}][1-2][0-9][0-9][0-9]"));
    }


    public static void main(String[] args) 
    {

         // 1. Email
        String email = "ravi123@gmail.com";

        extractEmail(email);

        System.out.println("------------------");


        // 2. Binary
        String binary = "101101";

        System.out.println("Binary: " + isBinary(binary));

        System.out.println("------------------");


        // 3. Hexadecimal
        String hex = "1A3F";

        System.out.println("Hexadecimal: " + isHexadecimal(hex));

        System.out.println("------------------");


        // 5. Remove special characters
        String str1 = "Hello@Java#123!";

        System.out.println(removeSpecialCharacters(str1));

        System.out.println("------------------");


        // 6. Remove extra spaces
        String str2 = "        Java   ";

        System.out.println(removeExtraSpaces(str2));

        System.out.println("------------------");
        
        // 5. Remove special characters
        isValidDate();
    }
    
}
