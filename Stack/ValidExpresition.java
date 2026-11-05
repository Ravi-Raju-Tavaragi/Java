package Stack;

public class ValidExpresition
{
    public static boolean isValidExpretion(String str, MyStack mystack)
    {
        if(str == null)
            return false;


        boolean isValidEXP = true;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if(ch == '(')
            {
                mystack.push(ch);
                continue;
            }

            else if(ch == ')')
            {
                if(mystack.peek() == -1)
                {
                    isValidEXP = false;
                    break;
                }
                mystack.pop();
            }
        }

        if(mystack.peek() != -1)
            isValidEXP = false;

        return isValidEXP;
    }


    public static void main(String[] args) 
    {
        String str = "(2+4)+(2+5)";
        MyStack myStack = new MyStack(100);

        System.out.println(isValidExpretion(str, myStack));
    }
    
}
