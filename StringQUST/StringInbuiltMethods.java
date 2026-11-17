package StringQUST;

public class StringInbuiltMethods
{
    //converts strings to char array
    //String is immutable but char array is mutable
    //Syntax : char[] arr = str.toCharArray()
    public static void demoToCharArray()
    {
        String name = "algorithms";

        char arr[] = name.toCharArray();
        System.out.println("Original : " +name);
        System.out.println();
        for(char ch : arr)
        {
            System.out.print(ch + " ");
        }
    }

    //equals()
    //compare two string for exact equality
    //actually it comapares content
    //syntax : str1.equals(str2)
    public static void demoEquals()
    {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "java";


        System.out.println();
        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
    }

    //equalsIgnorecase() -- ignore case sensitivity letter
    //compare two string for exact equality
    //actually it comapares content and ignore upper and lower case
    public static void demoEqualsIgnorecase()
    {
        String str1 = "java";
        String str2 = "Java";
        String str3 = "java";


        System.out.println();
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));
    }

    //compareTo()
    //compare two strings lexicographically
    //returns
    //0---> of strings are equal
    //< 0 --> first strings comes before second strings
    //> 0 --> first strings comes After second strings
    //comparison based on unicode values
    public static void democompareTo()
    {
        String str1 = "java";
        String str2 = "Ravi";
        String str3 = "java";


        System.out.println();
        System.out.println(str1.compareTo(str2));
        System.out.println(str2.compareTo(str1));
        System.out.println(str1.compareTo(str3));
    }

    //compare toIgnoreCase() -- explore write code
    //searching methods
    public static void demoCheckingStartwith()
    {
        String str1 = "java";
        String str2 = "Ravi";
        String str3 = "va";


        System.out.println();
        System.out.println(str1.startsWith(str3));
        System.out.println(str1.endsWith(str2));
    }

    //Extraction substring begain end
    public static void demoExtraction()
    {
        String str1 = "java";
        String str2 = "Ravi";

        System.out.println();
        System.out.println(str1.substring(2));
        System.out.println(str2.substring(1, 4));
    }

    //Replacements replaceall and replace
    public static void demoReplace()
    {
        String str1 = "Hi, Ravi How are You";
        String str2 = "Ravi, are you ok";

        System.out.println();
        System.out.println(str2.replace('a', '*'));
        System.out.println(str1.replaceAll(str1, str2));
    }
    
    //split()
    public static void demoSplit()
    {
        //String str1 = "Hi, Ravi How are You";
        String str2 = "Ravi, are you ok";

        System.out.println();
        System.out.println(str2.split("ou"));
    }

    //cleaning
    public static void demoCleaning()
    {
        String str1 = "Hi, Ravi How are You";
        String str2 = "Ravi, are you ok";

        System.out.println();
        str1.trim();
        System.out.println(str1);
        System.out.println(str2.isEmpty());
    }




    public static void main(String[] args) 
    {
        demoToCharArray();
        demoEquals();
        demoEqualsIgnorecase();
        democompareTo();
        demoCheckingStartwith();
        demoExtraction();
        demoReplace();
        demoSplit();
        demoCleaning();
    }
    
}
