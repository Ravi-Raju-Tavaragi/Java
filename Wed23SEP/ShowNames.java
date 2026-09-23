package Wed23SEP;

public class ShowNames
{
    static void showName(String ... name)
    {
        System.out.println("---This is My Team----");
        for(String n : name)
        {
            System.out.println(n);
        }
    }


    public static void main(String[] args)
    {
        showName("Anirudda", "Vikas", "Mahadeva", "Shreevardan", "Ravi");
    }
    
}
