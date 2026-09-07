package Thu03SEP;

public class Loop1
{
    public static void main(String[]args)
    {
        //forward 1 step
       /*  for(int index = 1; index <= 5; index++)
        {
            System.out.println(index+"Welcome to Algo");
        }


        //infinite for loop
        for(int index = 1; index <= 5;)
        {
            System.out.println("Algo");
        }

    //forward by step2
        for(int index = 0; index <= 20; index++)
            {
                index = index + 1;
                System.out.println(index);
            } 
        for(int index1 = -1; index1 <= 20; index1++)
        {
            index1 = index1 + 1;
            System.out.println(index1);
        }

        //another way
        for(int index3 = 1; index3 <= 10; index3+=2)
        {
            System.out.println(index3);
        }
        for(int index4 = 0; index4 <= 10; index4+=2)
        {
            System.out.println(index4);
        }*/
    //step backword by 1
    System.out.println("Step back by 1 digit");
        for(int index = 10; index>=1; index--)
        {
            
            System.out.println(index);
        }


        System.out.println("step back by 2 numbers Printing even numbers");
        for(int index1 = 10; index1>=0; index1-=2)
        {
           
            System.out.println(index1);
        }


         System.out.println("step back by 2 numbers Printing odd numbers");
        for(int index2 = 9; index2>=1; index2-=2)
        {
           
            System.out.println(index2);
        }
        //starts from negative numbers
        System.out.println("Starts from negative numbers");
        for(int num = -5; num<=5; num++)
        {
            System.out.println(num);
        }

        System.out.println("Floating point numbers");
        for(float num1 = 1.1F; num1<=5.0; num1+=1.1)
        {
            System.out.println(num1);
        }

        System.out.println("Character a to z");
        for(char ch='A'; ch<='Z'; ch++)
        {
            System.out.println(ch);
        }

       /*System.out.println("Infinite loops");
        for(;;)
        {
            System.out.println("Algo");
        }*/
    }
    
}
