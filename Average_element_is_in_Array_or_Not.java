import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int sum=0;
        int avg=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        avg=sum/n;
        int c=0;
        for(int i=0;i<n;i++)
        {
          if(avg==arr[i])
          {
             c=1;
          }
        }
        if(c==1)
        {
            System.out.print("True");
        }
        else
        {
            System.out.print("False");
        }
        
    }
}