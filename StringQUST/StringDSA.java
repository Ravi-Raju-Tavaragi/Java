package StringQUST;

import java.util.Arrays;

public class StringDSA
{
    public static void main(String[] args) 
    {
        String name = "algorithms 365 technologies HSR layout";

       char ch = name.charAt(5);
       System.out.println(ch);

       int returnvalue = name.compareTo("algorithms 365 technologies HSR layout");
       System.out.println(returnvalue);

       char[] namearr = name.toCharArray();
       System.out.println(namearr);
       String backtostring = Arrays.toString(namearr);
       System.out.println(backtostring+"after"); 

       int subPosition = 100;
       if(subPosition < name.length() && subPosition >= 0)
       {
            String subname = name.substring(0, 10);
            System.out.println(subname);
       }

       String replace = name.replace('a', '*');
       System.out.println(replace);

       int compare = name.compareToIgnoreCase("ALGORITHMS 365 technologies HSR layout");
       System.out.println("Difference is "+compare);

       
        
    }
    
}
