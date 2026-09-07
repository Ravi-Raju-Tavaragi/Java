public class AvgPer
{
    public static void main(String[]args)
    {
        int Kannada = 80;
        int English = 75;
        int Clang = 90;
        int Python = 85;
        int Java = 70;
        String Student_Name = "RAVI";

        System.out.println("Student Grade Card");
        System.out.println();
        System.out.println("Student Name : " + Student_Name);


        System.out.println("Marks Obtained in Kannada : " + Kannada);
        System.out.println("Marks Obtained in English : " + English);
        System.out.println("Marks Obtained in Clanguage : " + Clang);
        System.out.println("Marks Obtained in Python : " + Python);
        System.out.println("Marks Obtained in Java : " + Java);
        System.out.println();
        
        int total = Kannada + English + Clang + Python + Java;
        double average = total / 5.0;
        double percentage = (total / 500.0) * 100;

        System.out.println("Total Marks Obtained By Student : " + total);
        System.out.println();
        System.out.println("Average Marks You Got Overall " + average);
        System.out.println();
        System.out.println("Percentage Of The Student in Exam : " + percentage + "%");
    }
    
}
