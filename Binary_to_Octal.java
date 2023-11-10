import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            String z=sc.next();
            int a=Integer.parseInt(z,2);
            System.out.println(Integer.toString(a,8));
        }
    }
}