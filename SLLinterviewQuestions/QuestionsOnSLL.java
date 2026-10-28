package SLLinterviewQuestions;

public class QuestionsOnSLL
{
    static void printSLL(Node head)
    {
        if(head == null)
        {
            System.out.println("List emty");
            return ;
        }    
        

        System.out.print("head -->");

        while(head != null)
        {
            System.out.print(head.data + "-->");
            head = head.next;
        }

        System.out.print("null");
    }


    public static Node insertAtStart(int value, Node currenthead)
    {
      Node newNode = new Node();
      newNode.data = value;
      newNode.next = currenthead;
    
       return newNode;
    }

    public static void main(String[] args) 
    {
        System.out.println("\n Insert at start single node");
        Node head = null;
        head = insertAtStart( 500, head);
        head = insertAtStart(400, head);
        head = insertAtStart(300, head);
        head = insertAtStart(200, head);
        head = insertAtStart(100, head);
        printSLL(head);

        
    }
    
}
