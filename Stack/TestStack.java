package Stack;

public class TestStack
{

    public static void main(String[] args) 
    {
        int array[] = {1, 2, 3, 4, 5};
        MyStack myStack = new MyStack(5);

        myStack.pop();
        myStack.peek();

       
        for (int i = 0; i < array.length; i++)
        {
            myStack.push(array[i]);
        }

        myStack.print();

        for (int i = 0; i < array.length; i++)
        {
            array[i] = myStack.pop();
            System.out.print(array[i] +" ");
        }
        
    }
    
}
