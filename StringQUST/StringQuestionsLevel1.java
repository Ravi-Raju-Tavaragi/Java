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

    public static void stringDemo()
    {
        System.out.println();
        String name = "Ravi";

        System.out.println(name.length());
    }

    public static void singleChar()
    {
        System.out.println("--------------------------");
        System.out.println("next character");
        char ch = 'A';
        System.out.println(ch + " --> " + (char)(ch + 1));

        System.out.println("previous characte");
        char ch2 = 'B';
        System.out.println(ch2 + " --> " + (char)(ch2 - 1));

        System.out.println("caps to small characte");
        char ch3 = 'A';
        System.out.println(ch3 + " --> " + (char)(ch3 + 32));

        System.out.println("small to caps characte");
        char ch4 = 'a';
        System.out.println(ch4 + " --> " + (char)(ch4 - 32));

        System.out.println("given letter caps or small");
        char ch5 = 'M';
        if(ch5 >= 'A' && ch5 <= 'Z')
        {
            System.out.println(ch5 + " is Uppercase Letter");
        }
        else
        {
            System.out.println(ch5 + " is Lowercase Letter");
        }
    }

    public static void evenIndices(char[] name, String str)
    {
        for(int i = 0; i < name.length; i+=2)
        {
            System.out.print(name[i] + " " + i + ", ");
        }

        System.out.println();
        //for string
        for(int i = 0; i < str.length(); i+=2)
        {
            System.out.print(str.charAt(i) + " " + i + ", ");
        }

        System.out.println();
        System.out.println("printing middle element");
    
        if(name.length % 2 == 1)
        {
            System.out.println(name[name.length / 2]);
        }
        else
        {
            System.out.println("Two Midle First "+name[name.length / 2 - 1] +" Second "+ name[(name.length / 2)]);
        }

        System.out.println();
        System.out.println("For string print middle");

        if(str.length() % 2 == 1)
        {
            System.out.println(str.charAt((str.length() / 2)));
        }
        else
        {
            System.out.println(str.charAt((str.length() / 2 - 1)) + str.charAt(str.length() / 2));
        }

    }






    public static void main(String[] args) 
    {
        demoDefaultValues();
        printValues();
        asciiValuedemo();
        partialInitialization();
        stringDemo();

        //prints text as it is
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I'};
        System.out.println(name);
        //prints address
        int array[] = {10, 20, 30, 40};
        System.out.println(array);
        //prints text as it is
        String sub = "java";
        System.out.println(sub);

        String emoji = "😊";
        System.out.println(emoji.length());

        singleChar();

        evenIndices(name, sub);
    }
    
}
