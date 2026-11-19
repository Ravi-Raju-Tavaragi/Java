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

    //1) \w -- MATCHES ONE word
    public static void demoMatchOneWord()
    {
        String a = "8";
        System.out.println(a.matches("\\w"));
        System.out.println("A".matches("\\w"));
        System.out.println("@".matches("\\w"));
        System.out.println("_".matches("\\w"));
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
        demoMatchOneDigit();
        demoMatchOneWord();


    }
    
}
