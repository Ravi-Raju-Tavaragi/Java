package Fri25SEP;

public class SinglyLinkedList
{


    public static void main(String[] args) 
    {
        Node firsNode = new Node();
        firsNode.data = 101;
        firsNode.next = null;

        /*System.out.println(newNode);
        System.out.println(newNode.data);
        System.out.println(newNode.next);*/
        
        Node SecondNode = new Node();
        SecondNode.data = 102;
        SecondNode.next = null;
        firsNode.next = SecondNode;

        /*System.out.println(newNode.next.data);//102
        System.out.println(newNode.next.next);//null
        System.out.println(newNode.next.next.next);//null--> accessing next-->code fails or break here
        System.out.println(newNode.next.next.next.next.next);*/

        Node thirdNode = new Node();
        thirdNode.data = 103;
        thirdNode.next = null;

        SecondNode = thirdNode;


        //Insert at the begining
        Node newNode = new Node();
        newNode.data = 100;
        newNode.next = null;

        newNode.next = firsNode;
        firsNode.next = newNode;

        Node head = firsNode;
        


        
    }
    
}
