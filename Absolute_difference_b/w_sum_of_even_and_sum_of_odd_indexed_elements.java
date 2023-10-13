import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int count1=0;
        int count2=0;
        int i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        if(i%2==0)
        {
            count1+=arr[i];
        }
        else
        {
            count2+=arr[i];
        }
        }
        if(count2>count1)
        {
            System.out.printf("%d",count2-count1);
        }
        else
        {
            System.out.printf("%d",count1-count2);
        }
    }
}