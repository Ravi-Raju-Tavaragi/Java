package StringQUST;

public class IntegerToRoman
{
    public String intToRoman(int num) 
    {
        int n = 0;
        while(num > 0)
        {
            int digit = num % 10;
            n = n * 10 + digit;
            num = num / 10;
        }

        switch (n) {
            case 1:
                if(n == 1)
                    return "I";

                break;
        
            default:
                break;
        }
    }



    public static void main(String[] args) 
    {
        
    }
    
}
