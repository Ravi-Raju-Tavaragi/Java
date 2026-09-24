package Thu24SEP;

public class PrintDetails 
{
    public static void main(String[] args) 
    {
        
        
        for(String X : args)
        {
            String name, city;
            int age;
            name = "X";
            city = "X";
            age = Integer.parseInt(X);
            System.out.println("Details are : " + X);
        }
        
        
    }
    
}
