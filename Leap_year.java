
import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt();
        if(i%400==0 ||(i%4==0 && i%100!=0))
        {
           System.out.println("Leap year");
        }
        else
        {
           System.err.println("Not a leap year");
        }
    }
}