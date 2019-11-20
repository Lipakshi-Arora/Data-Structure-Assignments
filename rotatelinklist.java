import java.util.*;
public class rotatelinklist
{
	static class Node
	{
		Node next;
		int data;
		Node(int  data)
		{
			this.data=data;
			next=null;
		}
	}
	Node head;
	void insert(int data)
	{
		Node tem=new Node(data);
		if(head==null)
		{
			head=tem;
			return;
		}
		Node current=head;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=tem;
	}
	void rotate(int k)
	{
		int count=1;
		Node current=head;
		while(count<k&&current!=null)
		{
			current=current.next;
			count++;
		}
		Node temp=current;
		while(current.next!=null)
		{
			current=current.next;
		}
		current.next=head;
		head=temp.next;
		temp.next=null;
	}
	void print()
	{
		Node current=head;
		while(current!=null)
		{
			System.out.print(current.data+" ");
			current=current.next;
		}
	}
	public static void main(String args[])
	{
		rotateLinkedList l=new rotateLinkedList();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			l.insert(sc.nextInt());
		}
		System.out.println("Enter the location from where to rotate");
		int k=sc.nextInt();
		if(k<=size)
		{
			l.rotate(k);
			l.print();
		}
		else
		{
			System.out.println("Invalid");
		}
	}

}
