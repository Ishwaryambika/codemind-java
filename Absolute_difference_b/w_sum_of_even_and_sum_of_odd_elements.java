import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int i;
        int count1=0;
        int count2=0;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                count1+=arr[i];
            }
            else
            {
                count2+=arr[i];
            }
        }
        if(count1>count2)
        {
            System.out.printf("%d",count1-count2);
        }
        else
        {
            System.out.printf("%d",count2-count1);
        }
    }
}