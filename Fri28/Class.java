package Fri28;

import java.util.Arrays;

public class Class {
    public static void main(String[]args)
    {
        //int arr[5]; wrong
        int arr[] = new int[5];
        System.out.println(arr);//Hash value
        System.out.println(Arrays.toString(arr));//Default value 000000

        int arr1[] = {10,20,30};
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));

        int arr2[] = new int[] {12,2,33};
        System.out.println(arr2);
        System.out.println(Arrays.toString(arr2));
    }

}
