package StringQUST;

public class Regex
{
    //1) \d -- MATCHES ONE DIGIT
    public static void demoMatchOneDigit()
    {
        String a = "8";
        System.out.println(a.matches("\\d"));
        System.out.println("A".matches("\\d"));
    }

    //2) \w -- MATCHES ONE word
    public static void demoMatchOneWord()
    {
        String a = "8";
        System.out.println(a.matches("\\w"));
        System.out.println("A".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));
    }

    //3) \D -- MATCHES non digit
    public static void demoMatchNONOneWord()
    {
        String a = "8";
        System.out.println(a.matches("\\D"));
        System.out.println("A".matches("\\D"));
    }

    //4) \s -- MATCHES one whitespace character
    public static void demoMatchWhiteSpace()
    {
        System.out.println(" ".matches("\\s"));
        System.out.println("A".matches("\\s"));
    }

    
    //5) \s -- MATCHES any no space character
    public static void demoNonSpaceChar()
    {
        System.out.println("A".matches("\\S"));
        System.out.println(" ".matches("\\S"));
    }

    //6) \s -- MATCHES any non word character
    public static void demoNonWord()
    {
        System.out.println("@".matches("\\W"));
        System.out.println("#".matches("\\W"));
        System.out.println("A".matches("\\W"));
    }


    public static void main(String[] args) 
    {
        //regex .(dot) dot matches any character expect new line
        String text = "a";
        System.out.println(text.matches("."));//any character

        //2 [abc] matches exactly one character from given set
        System.out.println(text.matches("[abc]"));

        //[abc][vz] first character must be a|b|C and second character must be v|z
        System.out.println(text.matches("[abc][vz]"));

        //[^abc] except abc everything
        System.out.println(text.matches("[^abc]"));

        //[a-z 1-7] match all lower case and 1 - 7 digits
        System.out.println(text.matches("[a-z1-7]"));

        //A|B match A or B
        System.out.println(text.matches("A|B"));

        //xz matches exact sequence
        System.out.println(text.matches("xz"));


        //==============================================//

        // REGULAR META CHARACTERS  //

        //==============================================//
        System.out.println("---------------------------------");
        demoMatchOneDigit();
        System.out.println();
        demoMatchOneWord();
        System.out.println();
        demoMatchNONOneWord();
        System.out.println();
        demoMatchWhiteSpace();
        System.out.println();
        demoNonSpaceChar();
        System.out.println();
        demoNonWord();


    }
    
}
