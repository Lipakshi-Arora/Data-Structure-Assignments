
import java.util.Scanner;

public class reversedblyll
{
     static Node head;
    static class Node
    {
       int data;
       Node prev;
       Node next;
       Node(int d)
       {
           data=d;

       }
    }
       public static reversedblyll insert(reversedblyll li,int data)
       {
           Node newNode=new Node(data);
           newNode.next=null;
           if(li.head==null)
           {
               li.head=newNode;
               newNode.next=null;
               newNode.prev=null;
           }
           else
           {
               Node last=li.head;
               while(last.next!=null)
               {
                   last=last.next;
               }
               last.next=newNode;
               newNode.prev=last;
               newNode.next=null;
           }
           return li;
       }

        public static void display(reversedblyll li)
       {
           if(head==null)
           {
               System.out.println("List is empty");
           }
           else {
               Node current=li.head;
               while(current.next!=null)
          {
              current=current.next;
          }
               System.out.println("Reversed List is as follows:");
          while(current.prev!=null)
          {
              System.out.println(current.data);
              current=current.prev;
          }
          System.out.println(current.data);
                }
           }


        public static void main(String[] args)
        {
            reversedblyll rdl=new reversedblyll();
            Scanner sc=new Scanner(System.in);
            int elem;
            System.out.println("Enter the number of elements to be inserted:");
            int n=sc.nextInt();
            System.out.println("Enter the elements");
            for(int i=0;i<n;i++)
            {
                elem=sc.nextInt();
                rdl.insert(rdl,elem);
            }

            rdl.display(rdl);
        }
}
