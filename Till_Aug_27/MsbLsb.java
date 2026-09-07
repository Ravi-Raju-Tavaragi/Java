public class MsbLsb {
    public static void main(String[]args){

        //integer overflow 
        byte value = 127;
        System.out.println(value);
        value++;
        System.out.println(value);

        int x = 5;
        System.out.println("Binary:"+Integer.toBinaryString(x));
        int a = -5;
        System.out.println("Binary:"+Integer.toBinaryString(a));
    }
    
}
