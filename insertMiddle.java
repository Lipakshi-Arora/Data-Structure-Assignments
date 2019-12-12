import java.util.*;
public class insertMiddle {
	static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data=data;
			next=null;
		}
	}
	void insert(int new_data)
	{
		Node new_node=new Node(new_data);
		if(head==null)
		{
			head=new_node;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
			
		}
		current.next=new_node;
		new_node.next=null;
	}
	Node head;
	void calculate(int key)
	{
		Node current=head;
		Node current1=head;
	
		Node middle=new Node(key);
		Node new_mid=null;
		Node back=head;
		int count=0;
		while(current.next!=null)
		{
			count++;
		current=current.next;
		}
		int mid=count/2;
		for(int i=0;i<=mid;i++)
		{
			back=current1;
			current1=current1.next;
		}
	
		middle.next=back.next;
		back.next=middle;
		
		
	}
	void print2()
	{
		Node current2=head;

		while(current2!=null)
		{
			System.out.print(current2.data+" ");
			current2=current2.next;
		}
	}
	
	public static void main(String[] args)
	{
		insertMiddle m=new insertMiddle();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			m.insert(sc.nextInt());
		}
		System.out.println(("enter noe to insert"));
		int k=sc.nextInt();
		m.calculate(k);
		m.print2();
	}

}