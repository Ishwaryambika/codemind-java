import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        {
            if(n>2 && n<=5)
            {
                System.out.print("not weird");
            }
            else if(n>6 && n<=20)
            {
                System.out.print("weird");
            }
            else
            {
                System.out.print("not weird");
            }
        }
        else
        {
            System.out.print("weird");
        }
    }
}