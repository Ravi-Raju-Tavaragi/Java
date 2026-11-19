package StringQUST;

public class StringBuilderandBuffer
{
    //1)append() --- add texts at the end
    public static void demoAppend()
    {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println();
        sb.append(" Programming");
        System.out.println(sb);
    }
    
    //1)Insert() --- add texts at specified index
    public static void demoInsert()
    {
        StringBuilder sb = new StringBuilder("Java");

        System.out.println();
        sb.insert(1, "a");
        System.out.println(sb);
    }

    
    //1)delete() --- delete texts char from begain to end
    public static void demoDelete()
    {
        StringBuilder sb = new StringBuilder("Java Programing");

        System.out.println();
        sb.delete(4, 12);
        System.out.println(sb);
    }

    
    //1)replace() --- replaces characters
    public static void demoReplace()
    {
        StringBuilder sb = new StringBuilder("Java Programing");

        System.out.println();
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }

    //1)reverse() --- replaces characters
    public static void demoReverse()
    {
        StringBuilder sb = new StringBuilder("Java Programing");

        System.out.println();
        sb.reverse();
        System.out.println(sb);
    }

    //1)capacity() --- replaces characters
    public static void demoCapacity()
    {
        StringBuilder sb = new StringBuilder("Java Programing");

        System.out.println();
        System.out.println("Capacity : " +sb.capacity());
    }

    //1)ensurecapacity() --- replaces characters
    public static void demoEnsureCapacity()
    {
        StringBuilder sb = new StringBuilder();

        sb.ensureCapacity(50);

        System.out.println();
        System.out.println("Esure Capacity : " +sb.capacity());

    }

    //1)setCharAt() --- 
    public static void demoSetCharAt()
    {
        StringBuilder sb = new StringBuilder("Java Programing");

        sb.setCharAt(0, 'M');
        System.out.println();
        System.out.println(sb);
    }

    //1)setLength() --- 
    public static void demoSetLength()
    {
        StringBuilder sb = new StringBuilder("Java Programing");

        sb.setLength(7);
        System.out.println();
        System.out.println(sb);
    }

    

    



    public static void main(String[] args) 
    {

        
    }
    
}
