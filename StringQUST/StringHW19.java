package StringQUST;

public class StringHW19
{
    public static void main(String[] args) 
    {
        String str1 = "good";
        String str2 = " morning";

        System.out.println(str1.concat(str2));
        System.out.print(str1.repeat(5));

        int num = 12345;

        System.out.println(String.valueOf(num));
        String str3 = "Java is Easy. Java is powerful";

        System.out.println(str3.replace("is", "*"));
        System.out.println(str3.replaceFirst("is", "**"));
    }
    
}
