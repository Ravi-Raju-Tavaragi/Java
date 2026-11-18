package StringQUST;

public class Regex
{
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
    }
    
}
