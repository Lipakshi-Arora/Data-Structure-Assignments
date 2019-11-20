import java.util.*;
public class SumArray
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=sc.nextInt();
		}
		int b=sc.nextInt();
		int sum=0;
		int ws=0;
		for(int i=0;i<a;i++)
		{
			sum=sum+arr[i];
			if(sum<=b)
			{
				ws++;
			}
			if(sum>b)
			{
				sum=sum-arr[i-ws];
			}
			if(sum==b)
			{
				System.out.println((i-ws+1)+" "+i);
			}
	        if(b==arr[i])
	        {
	        	System.out.println(i+" "+i);
	        	sum=0;
	        	ws=0;
	        }
		}
	}

}
