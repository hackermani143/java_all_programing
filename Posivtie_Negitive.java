
import java.util.Scanner;


public class Posivtie_Negitive {
    public static void main(String[] args)
    {
        Scanner obj1=new Scanner(System.in);
        int i = obj1.nextInt();
        if(i<0)
        {
            System.out.println("Negitive number");
        } 
        else if( i==0)
        {
            System.out.println("zero");
        }
        else 
        {
            System.out.println("Positive");
        }
    }
}
