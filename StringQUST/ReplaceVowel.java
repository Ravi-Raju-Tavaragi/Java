package StringQUST;

public class ReplaceVowel
{
    public static void replaceVowelWithStar(char[] name)
    {
        for(char ch : name)
        {
            System.out.print(ch + " ");
        }
        System.out.println();

        for(int i = 0; i < name.length; i++)
        {
            if((name[i] == 'A' || name[i] == 'a') ||
                (name[i] == 'E' || name[i] == 'e') ||
                (name[i] == 'I' || name[i] == 'i') ||
                (name[i] == 'O' || name[i] == 'o') ||
                (name[i] == 'U' || name[i] == 'u') )
            {
                name[i] = '*';
            }
            System.out.print(name[i] + " ");
        }
    }


    public static void main(String[] args) 
    {
        char name[] = {'R', 'A', 'V', 'I', 'H', 'I', '1', '2'};
        
        
        replaceVowelWithStar(name);
    }
    
}
