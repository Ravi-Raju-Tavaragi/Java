package Stack;

public class PalindromeStack
{
    public static boolean isPalindromeArray(int array[], int temp[], MyStack mystack)
    {
        boolean isPalindrome = false;

        for(int i = 0; i < array.length; i++)
        {
            mystack.push(array[i]);
        }
        
        for (int i = 0; i < array.length; i++)
        {
            temp[i] = mystack.pop();
            if(array[i] != temp[i])
            {
                isPalindrome = false;
                return isPalindrome;
            }
            else
            {
                isPalindrome = true;
            }
        }
        if(isPalindrome)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        int array[] = {1, 2, 0, 2, 2, 1};

        MyStack mystack = new MyStack(7);

        int temp[] = new int[array.length];
        System.out.println(isPalindromeArray(array, temp, mystack));

    }
    
}
