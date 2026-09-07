public class Swap
{
    public static void main(String[] args){
        int a = 10;
        int b = 5;
        System.out.println(a);
        System.out.println(b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(a);
        System.out.println(b);
    }
    
}
