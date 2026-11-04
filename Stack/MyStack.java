package Stack;

public class MyStack
{
    private int top = -1;
    private int size = 5;
    private int values [];

    public void Mystack(int sizeOfStack)
    {
        this.values = new int[sizeOfStack];
        this.size = sizeOfStack;

    }

    public void push(int value)
    {
        if(this.top == this.size - 1)
        {
            System.out.println("stack is full");
            return ;
        }

        this.top++;
        this.values[this.top] = value;
    }

    public int peek()
    {
       return this.values[this.top];
    }

    public int pop()
    {
        if(this.top == -1)
        {
            System.out.println("stack is empty");
            return -504;
        }
        
        int index = this.top;
        this.top--;
        return this.values[index];
    }



    public static void main(String[] args) 
    {

        
    }   
}
