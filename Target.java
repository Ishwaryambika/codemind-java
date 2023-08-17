import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(a>=10 && b>=10 && c>=10 && d>=10)
        {
            System.out.print("YES");
        }
        else
        {
            System.out.print("NO");
        }
    }
}