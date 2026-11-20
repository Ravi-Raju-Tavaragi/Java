package StringQUST;

// Decode compressed string
// Input : a3b4c2
// Output : aaabbbbcc
// Assumption : Every char is followed by single digit
// use StringBuilder bcz we dont know size of output
// TimeComplexity : 
// SpaceComplexity :

// parsing + stringBuilder 
public class DeeCodeCompressedString
{
    public static void testCode(String input)
    {
        System.out.println("Input : " + input);
        System.out.println("Output : " + decode(input));
        System.out.println();
    }

    public static String decode(String input)
    {
        StringBuilder answer = new StringBuilder();

        for(int i = 0; i < input.length(); i = i+2)
        {

            //read character
            char currentChar = input.charAt(i);

            //read number
            int number = input.charAt(i + 1) - '0'; // parsing converting one format to other
          //number = number * 10 + (input.charAt(i) - '0'); -- any case it will handle
            //int number = '3' - '0' 51-48 = 3

            //append
            for(int count = 1; count <= number; count++)
            {
                answer.append(currentChar);
            }
        }

        return answer.toString();
    }






    public static void main(String[] args) 
    {
        testCode("a3b4c2");    
        testCode("x1y5");
        testCode("m2n3"); 
         testCode("a1");
    }
    
}
