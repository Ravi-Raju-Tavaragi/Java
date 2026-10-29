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


    //WFTO make circular LL
    static Node getNodeCLL(Node head)
    {
        if(head == null)
            return null;

        while (head.next != null) 
        {
            head = head.next;   
        }
        return head;
    }

    static void joinTwoLList(Node listhead1, Node listhead2)
    {
        if(listhead1 == null && listhead2 == null)
            return ;

        /*if(listhead1 == null || listhead2 == null)
        {
            Node list = null;
            if(listhead1 == null)
                list = listhead2;
            else
                list = listhead1;

            Node lastNode =getNodeCLL(list);
            lastNode.next = list;
            return ;
        }

        Node List1Tail = getNodeCLL(listhead1);
        Node List2Tail = getNodeCLL(listhead2);

        List1Tail.next = listhead2;
        List2Tail.next = listhead1;*/
        if(listhead1 == null)
        {
            Node lastNode = getNodeCLL(listhead2);
            lastNode.next = listhead2;
            return;
        }

        if(listhead2 == null)
        {
            Node lastNode = getNodeCLL(listhead1);
            lastNode.next = listhead1;
            return;
        }

        Node list1Tail = getNodeCLL(listhead1);
        Node list2Tail = getNodeCLL(listhead2);

        list1Tail.next = listhead2;
        list2Tail.next = listhead1;
    }


    static void printCLL2(Node head)
    {
        if(head == null)
        {
            System.out.println("List empty");
            return;
        }

        Node current = head;

        System.out.print("head --> ");

        do
        {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        while(current != head);

        System.out.println("(back to head)");
    }

    // Return Midle Node Value
    static int midleNode(Node head)
    {
        if(head == null)
            return 0;

        Node slow = head;
        Node fast = head;
 
        //odd case
        while(fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            // Even case
            if(fast == null)
                return slow.data;
        }
        return slow.data;
    }

    // Sum of First and Last Node
    static int sumOfFirstandLastNode(Node head)
    {
        if(head == null)
            return 0;

        int firsttNodeValue = head.data;
        int lastNodeValue = head.data;

        while(head != null)
        {
            lastNodeValue = head.data;
            head = head.next;
        }

        return firsttNodeValue + lastNodeValue;
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

        Node head2 = null;
        head2 = insertAtStart(900, head2);
        head2 = insertAtStart(800, head2);
        head2 = insertAtStart(700, head2);
        head2 = insertAtStart(600, head2);
        printSLL(head2);
      /*   
        System.out.println();
        joinTwoLList(head, head2);
        printCLL2(head);
      */
       
        System.out.println();
        int result1 = midleNode(head);
        System.out.println(result1 + " Odd Number of nodes");

        System.out.println();
        int result2 = midleNode(head2);
        System.out.println(result2 + " Even Number of nodes");

        System.out.println();
        System.out.println(sumOfFirstandLastNode(head) + " Sum of First and Last Node data");

    }
    
}
