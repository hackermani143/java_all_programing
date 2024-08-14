
import java.util.Scanner;

public class Sum_First_N_Natural {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int i = obj.nextInt();
        int j= obj.nextInt();
        int sum=0;
        for(i=0;i<j;i++)
        {
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
