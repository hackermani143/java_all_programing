
import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner obj =new Scanner(System.in);
        int i= obj.nextInt();
        int count=0;
        if(i<0 || i==1)
        {
            System.out.println("Given Number greter than 1");
        }
        else{
        for(int x=1;x<=i;x++)
        {
            if(i%x==0)
            count=count+1;
        }
        if(count>2)
        {
            System.out.println("not prime number ");
        }
        else{
            System.out.println("prime");
        }
    }
    }
}
