import java.util.*;
public class PhoneBook {
	public static void main(String[] args)
	{
		HashMap<String,String>map=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of phonbook list");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
			String name=sc.nextLine();
			String phone=sc.nextLine();
		
			map.put(name,phone);
			
		}
		System.out.println("Enter name of person to print contact ");
		while(sc.hasNext())
		{
			String s=sc.nextLine();
			if(map.containsKey(s))
			{
				System.out.println(s+" = "+map.get(s));
			}
			else
			{
				System.out.println("Not Found");
			}
		}
	}

}