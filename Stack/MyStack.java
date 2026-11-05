package Stack;

public class MyStack
{
    private int top = -1;
    private int size = 0;
    private int values [];

    public MyStack(int sizeOfStack)
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
        if(this.top == -1)
        {
            System.out.println("stack is empty");
            return -504;
        }

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

    public void print()
    {
        if (this.top == -1)
        {
            System.out.println("Stack is empty");
            return;
        }

        for (int i = this.top; i >=0; i--)
        {
            System.out.println(" [ " + i + " ]  --> " + this.values[i]);
        }
    }

}
