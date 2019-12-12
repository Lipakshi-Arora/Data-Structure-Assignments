import java.util.*;
import java.util.LinkedList;
public class stackUsingQueues {
	static Queue <Integer>q1=new LinkedList<>();
	static Queue <Integer>q2=new LinkedList<>();
	public static void push(int data) {
		while(!q1.isEmpty()) {
			q2.add(q1.poll());
		}
		q1.add(data);
		while(!q2.isEmpty()) {
			q1.add(q2.poll());
		}
	}
	public static void pop() {
		while(!q1.isEmpty())
		{
		System.out.println(q1.remove());
		}
	}
	public static void peek() {
		System.out.println(q1.element());
	
	}
public static void main(String[] args)
{
	stackUsingQueues s1=new stackUsingQueues();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number of elements in stack");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
	s1.push(sc.nextInt());
	}

//	s1.pop();
	s1.peek();
}
}