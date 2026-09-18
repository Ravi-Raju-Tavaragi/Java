package Fri18SEP;

public class PassByRefference
{
   public static void makeItHalf(Data newData)
    {
        newData.number = newData.number / 2;
    }

    public static void main(String[] args)
    {
       Data newData = new Data();
       newData.number = 100;

       makeItHalf(newData);
       System.out.println(newData.number);


    }
    
}
