import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++)
        {
            for(int j=1;j<=a;j++)
            {
                System.out.print((char)(64+i)+" ");
            }
            System.out.println();
        }
    }
}