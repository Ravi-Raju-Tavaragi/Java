package Thu24SEP;

public class PrintDetails 
{
    public static void main(String[] args) 
    {
        String name, city;
        int age;
        
        for(String X : args)
        {
            name = "X";
            city = "X";
            age = Integer.parseInt(X);
            System.out.println("Details are : " + name);
            System.out.println("Details are : " + city);
            System.out.println("Details are : " + age);
        }
        
    }
    
}
