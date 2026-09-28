package Fri25SEP;

public class SinglyLinkedList
{


    public static void main(String[] args) 
    {
        Node newNode = new Node();
        newNode.data = 101;
        newNode.next = null;

        System.out.println(newNode);
        System.out.println(newNode.data);
        System.out.println(newNode.next);
        
        Node SecondNode = new Node();
        SecondNode.data = 102;
        SecondNode.next = null;

        newNode.next = SecondNode;

        System.out.println(newNode.next.data);//102
        System.out.println(newNode.next.next);//null
        System.out.println(newNode.next.next.next);//null--> accessing next-->code fails or break here
        System.out.println(newNode.next.next.next.next.next);
        
    }
    
}
