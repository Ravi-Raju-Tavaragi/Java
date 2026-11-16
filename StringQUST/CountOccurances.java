package StringQUST;

public class CountOccurances
{
    public static void countOccurance(char[] name, char target)
    {
        int count = 0;
        for(int i = 0; i < name.length; i++)
        {
            if(name[i] == target)
            {
                count++;
            }
        }

        System.out.println(count);
    } 
    public static void main(String[] args) 
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I', '1', '2'};
        char target = 'I';

        countOccurance(name, target);
        
    }
    
}
