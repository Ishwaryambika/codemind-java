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
        int e=sc.nextInt();
        double per=(a+b+c+d+e)/5;
        if(per>=90)
        {
            System.out.print("Grade A");
        }
        else if(per >=80)
        {
            System.out.print("Grade B");
        }
        else if(per>=70)
        {
            System.out.print("Grade C");
        }
        else if(per>=60)
        {
            System.out.print("Grade D");
        }
        else if(per>=40)
        {
            System.out.print("Grade E");
        }
        else 
        {
            System.out.print("Grade F");
        }
    }
}