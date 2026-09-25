package Fri25SEP;

public class ArrayDSA 
{
    public static void main(String[] args)
    {
        int[] marks = {10, 20, 30, 40};

        for(int i = 0; i < marks.length; i++)
        {
            marks[3] = 100;
            System.out.print(marks[i]);
        }
        /*System.out.print(marks[0]);
        System.out.print(marks[1]);
        System.out.print(marks[2]);
        System.out.print(marks[3]);*/


        int[] marks1 = new int[5];
        for(int i = 0; i < marks1.length; i++)
        {
            System.out.print(marks1[i]);
        }


    }
    
}
