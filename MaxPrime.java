import java.util.*;
public class MaxPrime {
	static boolean prime(int n)
	{
		for(int i=2;i<n;i++)
		{
		if(n%i==0)
		{
			return false;
		}
		}
		return true;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		int number=sc.nextInt();
		int max=0;
		for(int i=1;i<number;i++)
		{
			if(number%i==0)
			{
				if(prime(i))
				{
					max=i;
				}
			}
		}
		System.out.println("largest primeFactor of : "+number+" is "+max);
	}