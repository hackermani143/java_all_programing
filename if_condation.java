//  print the given number is even or not
import java.util.Scanner;
// print even or odd only if
class if_condation{
    public static void main(String[] args){
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        if (a%2==0)
        {
            System.out.println("even");
        }
        if (a%2==1)
        {
            System.out.println("odd");
        }
    }
}