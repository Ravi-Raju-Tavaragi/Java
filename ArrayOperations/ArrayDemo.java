package ArrayOperations;

public class ArrayDemo
{
    
    public static void main(String[] args)
    {
        MyArray myArray = new MyArray();
        
        /*System.out.println("Initial Array");
        myArray.printArrayElements();*/

        myArray.insertAtEnd(10);
        myArray.insertAtEnd(20);
        myArray.insertAtEnd(30);
        myArray.insertAtEnd(40);
        myArray.insertAtEnd(50);

        System.out.println("After Inserting Elements at End");
        myArray.printArrayElements();


        myArray.deleteFromEnd();
        System.out.println("Deleting Element at End");
        myArray.printArrayElements();

        myArray.deleteFromStart();
        System.out.println("Deleting Element at Start");
        myArray.printArrayElements();

        myArray.deleteFromAnyPosition(2);
        System.out.println("Deleting Element at AnyPosition");
        myArray.printArrayElements();


       /*myArray.insertAtStart(5);
        System.out.println("After Inserting Elements at Start");
        myArray.printArrayElements();

        myArray.insertAtAnyPosition(4, 2);
        System.out.println("After Inserting Elements at gien position");
        myArray.printArrayElements();

        //Edge cases
        System.out.println("Checking Edge cases");
        myArray.insertAtAnyPosition(10, -1);
        myArray.insertAtAnyPosition(2, 7);
        myArray.printArrayElements();


        System.out.println("After Inserting Elements at End --> checking array full");
        myArray.insertAtEnd(70);
        myArray.printArrayElements();*/

    }
    
}
