public class TempCF
{
  public static void main(String[] args) 
  {
      // Celsius
        double celsius = 25;
        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");

        // Fahrenheit 
        fahrenheit = 77;
        celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
    
  }
    
}
