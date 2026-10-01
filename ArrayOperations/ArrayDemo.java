package ArrayOperations;

public class ArrayDemo
{





    public static void main(String[] args)
    {
        MyArray myArray = new MyArray();
        
        System.out.println("Initial Array");
        myArray.printArrayElements();

        myArray.insertAtEnd(10);
        myArray.insertAtEnd(20);
        myArray.insertAtEnd(30);

        System.out.println("After Inserting Elements at End");
        myArray.printArrayElements();

        myArray.insertAtStart(5);
        System.out.println("After Inserting Elements at Start");
        myArray.printArrayElements();

        myArray.insertAtAnyPosition(4, 2);
        System.out.println("After Inserting Elements at gien position");
        myArray.printArrayElements();

    }
    
}
