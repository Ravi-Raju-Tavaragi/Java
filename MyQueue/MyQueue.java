package MyQueue;

public class MyQueue
{
    private int[] values;
    private int first = 0;
    private int last = 0;
    private int size = 0;
    private int count = 0;

    public MyQueue(int size)
    {
        this.size = size;
        this.values = new  int[size];
    }

    public int enQueue(int value)
    {
        //queue full
        if(this.count == this.size)
            return -1;

        //queue full but we have space at start
        if(this.last == this.size && this.first > 0)
        {
            //shift element to start
            //start = 0
            //first is in middle
            for(int loop = 0; loop < this.count; loop++)
            {
                this.values[loop - 1] = this.values[this.first + loop]; 
            }
            this.first = 0;
            this.last = this.count;
        } 

        this.values[this.last] = value;
        this.last++;
        this.count++;

        return 0;
    }
    
    public int deQueue()
    {
        if(this.count == 0)
            return -1;
        
        int index = this.first;
        this.first++;
        this.count--;
        return this.values[index];
    }

    public boolean isEmpty()
    {
        return (this.count == 0);
    }

    public int getCount()
    {
        return this.count;
    }
}
