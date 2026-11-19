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

    //QUANTIFIERS

    //1) star quantifier 0 or more
    public static void demoQuantStar()
    {
        String s1 = "abscsccctrdsnan";
        String s2 = "aaaabbbbccc";
        String s3 = "a98";
        System.out.println(s1.matches("[abc]*"));
        System.out.println(s2.matches("[abc]*"));
        System.out.println(s3.matches("[abc]*"));
    }

    //2) plus quantifier 0 or more
    public static void demoQuantPlus()
    {
        String s1 = "abc";
        String s2 = "";
        String s3 = "aaabbb";
        System.out.println(s1.matches("[abc]+"));
        System.out.println(s2.matches("[abc]+"));
        System.out.println(s3.matches("[abc]+"));
    }
    
    //03) exact count ({n})
    public static void demoQuantExactCount()
    {
        String s1 = "abc";
        String s2 = "";
        String s3 = "aaabbb";
        System.out.println(s1.matches("[abc]{3}"));
        System.out.println(s2.matches("[abc]{3}"));
        System.out.println(s3.matches("[abc]{3}"));
    }

    //04) {min, max} -- check within range
    public static void demoQuantMinMax()
    {
        String s1 = "abccba";
        String s2 = "ab";
        String s3 = "abccbaaa";
        System.out.println(s1.matches("[abc]{3, 5}"));
        System.out.println(s2.matches("[abc]{0, 3}"));
        System.out.println(s3.matches("[abc]{3, 5}"));
    }

    //05) check for 0 or 1 ?
    public static void demoQuantQuetionMArk()
    {
        String s1 = "ac";
        String s2 = "abc";
        String s3 = "abbc";
        System.out.println(s1.matches("ab?c"));
        System.out.println(s2.matches("ab?c"));
        System.out.println(s3.matches("ab?c"));

        System.out.println(s3.matches("abb?c"));
        System.out.println(s3.matches("ab?b?c"));
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
        /*System.out.println("---------------------------------");
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
        demoNonWord();*/
        //==============================================//

        // REGULAR QUANTIFIERS  //

        //==============================================//
        System.out.println("---------------------------------");
        demoQuantStar();

        System.out.println();
        demoQuantPlus();

        System.out.println();
        demoQuantExactCount();

        System.out.println();
        demoQuantMinMax();

        System.out.println();
        demoQuantQuetionMArk();


    }
    
}
