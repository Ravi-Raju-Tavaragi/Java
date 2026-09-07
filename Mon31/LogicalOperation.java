package Mon31;

public class LogicalOperation {
    public static void main(String[] args) {
        int x = 10;
        int y = 6;
        int z;
        System.out.println("And = " + (x&y));
        System.out.println("OR ="+(x | y));
        System.out.println("XOR ="+(x ^ y));
        System.out.println("NOT X ="+(~x));
        System.out.println("NOT Y ="+(~y));
       
        System.out.println("left shift");
        int a = 10;
        System.out.println("Left Shift by 1 place ="+(a << 1));
        System.out.println("Left Shift by 2 place ="+(a << 2));
        System.out.println("Left Shift by 3 place ="+(a << 3));
        System.out.println("Left Shift by 4 place ="+(a << 4));
        
        System.out.println("Right shift");
        int b = 50;
        System.err.println("Right shift by 1 place ="+(b >> 1));
        System.err.println("Right shift by 2 place ="+(b >> 2));
        System.err.println("Right shift by 3 place ="+(b >> 3));
        System.err.println("Right shift by 4 place ="+(b >> 4));

        System.out.println("Unsigned Right shift");
        int c = -10;
        System.err.println("Right shift by 1 place ="+(c >>> 1));
        System.err.println("Right shift by 2 place ="+(c >>> 2));
        System.err.println("Right shift by 3 place ="+(c >>> 3));

        z = ~x;
        System.out.println(z);

        System.out.println("Relational Operators");
        int num1 = 20;
        int num2 =30;
        System.out.println(num1 == num2);
        System.out.println(num1 != num2);
        System.out.println(num1 > num2);
        System.out.println(num1 < num2);
        System.out.println(num1 >= num2);
        System.out.println(num1 <= num2);

        System.out.println("Unary");
        
    }
}
