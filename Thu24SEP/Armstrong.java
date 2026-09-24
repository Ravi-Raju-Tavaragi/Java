package Thu24SEP; 
import java.util.Scanner; 
public class Armstrong 
{ 
    static boolean isArmstrong(int n) 
    { 
        int original = n; 
        int sum = 0; 
        int digits = 0; 
        int temp = n; 
        // Count digits 
        while (temp > 0) 
        { 
            digits++; temp = temp / 10; 
        } 
        temp = n; 
        // Calculate sum of powers
        while (temp > 0) 
        { 
            int digit = temp % 10; int power = 1; 
            for (int i = 1; i <= digits; i++) 
            { 
            power = power * digit; 
            } 
            sum = sum + power; temp = temp / 10; 
        } 
        return sum == original; 
    } 
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: "); 
        int n = sc.nextInt(); 
        if (isArmstrong(n)) 
            { 
                System.out.println("Armstrong Number"); 

            } else
                 { System.out.println("Not Armstrong Number"); 

                 } 
                 sc.close(); 
                } 
            }