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


    //return nth node
    static Node getNode(Node head, int n)
    {
        if(head == null || n <= 0)
            return null;

        int count = 1;
        while(count <= n)
        {
            count = count + 1;
            if(head == null)
                return null;
            else
                head = head.next;
        }
        return head;
    }

    //return number of nodes in singly linked list
    static int getNumberOfNodes(Node head)
    {
        if(head == null)
            return 0;

        int count = 1;
        while(head != null)
        {
            head = head.next;
            count++;
        }
        return count;
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


        System.out.println();
        Node result = getNode(head, 3);

        if(result != null)
            System.out.println("Node data: " + result.data);
        else
            System.out.println("Node not found");

        System.out.println(getNumberOfNodes(head));
        
    }
    
}
