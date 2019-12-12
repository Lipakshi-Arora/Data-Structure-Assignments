import java.util.*;
public class QueueUsingStack {
	static class Queue  
	{  
	    static Stack<Integer> s1 = new Stack<Integer>();  
	    static Stack<Integer> s2 = new Stack<Integer>();  
	  
	    static void enQueue(int x)  
	    {  
	    	while (!s1.isEmpty()) 
	        {  
	            s2.push(s1.pop());  
	        }  
	 
	        s1.push(x);  
	        while (!s2.isEmpty())  
	        {  
	            s1.push(s2.pop());  

	        }  
	    }  
	  
	    static void deQueue()  
	    {  

	        if (s1.isEmpty())  
	        {  
	            System.out.println("Q is Empty");  
	            System.exit(0);  
	        }  
	  

	        while (!s1.isEmpty())  
	        {  
	        	System.out.println(s1.pop());
	        }
	        
	    }  
	};  
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of elements in queue");
	    Queue q = new Queue();
	    int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
	    q.enQueue(sc.nextInt());  
		}
	  
		q.deQueue();
	}

}