import java.util.Scanner;

public class subarraycount
{
    public static void main(String[] args)
    {
        int count=0,max=0;
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of an array:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the integer to compare:");
        int k=sc.nextInt();
        for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				max=0;
				for(int a=i;a<=j;a++)
				{
					if(arr[a]>max)
						max=arr[a];
				}
				if(max>k)
					count++;
			}
		}
		System.out.println("Output : "+count);
    }
}
