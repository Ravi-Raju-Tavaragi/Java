package Mon31;

public class Counter {
    
    public static void main(String[]args)
    {
        int count = 10;
        System.out.println(count++);//10
        System.out.println(count);//11
        System.out.println(count++);//11
        System.out.println(count++);//12
      

        System.out.println(count--);//13
        System.out.println(count);//
        System.out.println(count--);
        System.out.println(count--);

        System.out.println(++count);
        System.out.println(count);
        System.out.println(++count);
        System.out.println(++count);

        System.out.println(--count);
        System.out.println(count);
        System.out.println(--count);
        System.out.println(--count);

        int count1 = 12;
        int count2 = count1++;
        System.out.println(count2);//12
        System.err.println(count1);//13

        int a = 10;
        int b = ++a;
        System.out.println(b);//11
        System.err.println(a);//11

        //behavior in expression
        System.out.println("Expression Behavior");
        int c = 10;
        System.out.println(c++ + 5);
        System.out.println(c);
        System.out.println(++c + 5);
        System.out.println(c);

        //confusing behavior
        System.out.println("Confusing behavior");
        int num = 10;
        System.out.println(num++ + ++num);//10+12
        System.out.println("Confusing behavior"); 
        int num1 = 11;
        System.err.println(num1++ + num1++);

        int num2 = 12;
        System.out.println(num2++ - ++num2);

        int num3 = 20;
        System.out.println(++num3 + --num3);

    

        
        



        
    }
}
