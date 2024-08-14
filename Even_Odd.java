import java.util.Scanner;
public class Even_Odd 
{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i=obj.nextInt();
        if(i%2==0)  // check for even % gives remender 
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd");
        }
    }
    
}
