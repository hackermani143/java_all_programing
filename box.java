import java.util.Scanner;
class box
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        int a = obj.nextInt();
        for(int i=1;i<=a;i++)
        {
            for (int j=0;j<=a;j++)
            {
                System.out.print("*");
            }
            System.out.println();
           
        }
    }

}