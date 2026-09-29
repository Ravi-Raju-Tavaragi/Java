package DSA;

public class SinglyLinkedList1
{
    public static void printList(Node node)
    {
        System.out.print(" head -> ");
        while (node != null)
        {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print(" null ");
    }

    public static Node insertAtStart(int data, Node head)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        newNode.next = head;
        return  newNode;
    }

    public static void insertAtEnd(int data, Node head)
    {
        Node newNode = new Node();//newnode-->lastnode inserting at end
        newNode.data = data;
        newNode.next = null;

        Node temp = head;//temp
        while (temp.next != null)
            temp = temp.next;

        temp.next = newNode;//lastnode-->newnode
    }


    public static void main(String[] args) 
    {
        Node firsNode = new Node();
        firsNode.data = 101;
        firsNode.next = null;

        Node SecondNode = new Node();
        SecondNode.data = 102;
        SecondNode.next = null;

        
        Node thirdNode = new Node();
        thirdNode.data = 103;
        thirdNode.next = null;

        firsNode.next = SecondNode;
        SecondNode.next = thirdNode;

        
        Node head = firsNode;
        printList(head);

        System.out.println("\nAfter inserting at start \n");
        head = insertAtStart(500, head);
        printList(head);

        System.out.println("\nAfter inserting at end \n");
        insertAtEnd(1000, head);
        printList(head);

    }
    
}
