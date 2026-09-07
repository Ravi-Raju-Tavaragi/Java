package Thu03SEP;

public class TodayClass
{
    public static void main(String[]args)
    {
        System.out.println("case1:Both String literals");
        String s1 = "Saturday";
        String s2 = "Saturday";

        if(s1 == s2 && s1.equals(s2))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

        System.out.println("case2:Both using new String");
        String s3 = new String("java");
        String s4 = new String("java");
        if(s3 == s4 && s3.equals(s4))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }

        System.out.println("case3:String vs literals");
        String s5 = "Java";
        String s6 = new String("Java");
        if(s5 == s6 && s5.equals(s6))
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
    

        
    }
    
}
