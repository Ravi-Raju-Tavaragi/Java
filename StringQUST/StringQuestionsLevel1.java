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
        System.out.println();
        System.out.println(" Values");
        char name[] = {'R', 'A', 'V', 'I'};

        for(int i = 0; i < name.length; i++)
        {
            System.out.print(name[i] + " ");
        }

        System.out.println("\n length " + name.length);
    }

    public static void asciiValuedemo()
    {
        System.out.println("Ascii Values");
        char name[] = {65, 66, 67, 68, 69, 70};

        for(int i = 65; i < name.length; i++)
        {
            System.out.print(name[i] + " ");
        }
    }

    public static void partialInitialization()
    {
        System.out.println();
        System.out.println("Default Values");
        char name[] = new char[5];

        for(int i = 0; i < name.length; i++)
        {
            System.out.print((int)name[i] + " ");
        }

        System.out.println();

        name[0] = 'R';
        name[1] = 'A';
        for(int i = 0; i < name.length; i++)
        {
            System.out.print(name[i] + " ");
            
        }
    }

    public static void main(String[] args) 
    {
        demoDefaultValues();
        printValues();
        asciiValuedemo();
        partialInitialization();
    }
    
}
