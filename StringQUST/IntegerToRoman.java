package StringQUST;

public class IntegerToRoman
{
    public static String intToRoman(int num) 
    {
       String result = "";

        int thousands = num / 1000;
        int hundreds = (num / 100) % 10;
        int tens = (num / 10) % 10;
        int ones = num % 10;

        // Thousands
        switch(thousands)
        {
            case 1: result += "M"; break;
            case 2: result += "MM"; break;
            case 3: result += "MMM"; break;
        }

        // Hundreds
        switch(hundreds)
        {
            case 1: result += "C"; break;
            case 2: result += "CC"; break;
            case 3: result += "CCC"; break;
            case 4: result += "CD"; break;
            case 5: result += "D"; break;
            case 6: result += "DC"; break;
            case 7: result += "DCC"; break;
            case 8: result += "DCCC"; break;
            case 9: result += "CM"; break;
        }

        // Tens
        switch(tens)
        {
            case 1: result += "X"; break;
            case 2: result += "XX"; break;
            case 3: result += "XXX"; break;
            case 4: result += "XL"; break;
            case 5: result += "L"; break;
            case 6: result += "LX"; break;
            case 7: result += "LXX"; break;
            case 8: result += "LXXX"; break;
            case 9: result += "XC"; break;
        }

        // Ones
        switch(ones)
        {
            case 1: result += "I"; break;
            case 2: result += "II"; break;
            case 3: result += "III"; break;
            case 4: result += "IV"; break;
            case 5: result += "V"; break;
            case 6: result += "VI"; break;
            case 7: result += "VII"; break;
            case 8: result += "VIII"; break;
            case 9: result += "IX"; break;
        }

        return result;
    
    }



    public static void main(String[] args) 
    {
        int num = 3000;
        System.out.println("Integer number - "+num+" Roman Number - "+intToRoman(num));
        
    }
    
}
