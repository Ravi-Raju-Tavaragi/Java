package Fri18SEP;


public class Functionclass
{
    /*public static void makeItHalfNumber(int number)
    {
        number = number / 2;

    }


    public static int makeItHalfNumber2(int number2)
    {
        number2 = number2 / 2;
        return number2;

    }*/

    public static void makeItHalf(Data newData)
    {
        newData.number = newData.number / 2;
    }


    public static void main(String[] args) 
    {
      /*int number = 10;

       makeItHalfNumber(number);

       System.out.println(number);



       int number2 = 20;

       number2 = makeItHalfNumber2(number2);

       System.out.println(number2);*/

       //user defined data type
       Data newData = new Data();
       newData.number = 100;

       makeItHalf(newData);
       System.out.println(newData.number);

        
    }
    
}
