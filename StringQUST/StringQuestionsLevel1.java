package StringQUST;

public class StringQuestionsLevel1
{
    public static void demoDefaultValues()
    {
        System.out.println("Default Values");
        char name[] = new char[5];

        for(int i = 0; i < name.length; i++)
        {
            System.out.print((int)name[i] + " ");
        }
    }

    public static void printValues()
    {
        System.out.println("Default Values");
        char name[] = {'R', 'A', 'V', 'I'};

        for(int i = 0; i < name.length; i++)
        {
            System.out.print(name[i] + " ");
        }
    }

    public static void printElements(char[] name)
    {
        for(int i = 0; i < name.length; i++)
        {
            System.out.print(name[i] + " ");
        }
    }

    public static void main(String[] args) 
    {
        demoDefaultValues();
        printValues();
    }
    
}
