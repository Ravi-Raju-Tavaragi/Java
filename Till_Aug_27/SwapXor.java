public class SwapXor 
{
    public static void main (String[] args){
        int a = 10;
        int b = 15;
        System.out.println("Numbers Before Swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Numbers After Swap");
        System.out.println("a:" + a);
        System.out.println("b:" + b);
    }
    
}
