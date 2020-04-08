
//Given an array arr[] of N integers, the task is to make two binary search trees. One while
//traversing from the left side of the array and another while traversing from the right and find
//which tree has a greater height.
package practice;

import java.util.*;

public class maxHeightFrom2Arrays 
{
    static class node
    {
        int key;
        node left,right;
        
    }
    static node newNode(int i) 
    { 
        node temp = new node(); 
        temp.key = i; 
        temp.left = temp.right = null; 
        return temp; 
    } 
    static node insert(node node, int key) 
    { 
        if (node == null) 
            return newNode(key); 

        
        if (key < node.key) 
            node.left = insert(node.left, key); 
        else if (key > node.key) 
            node.right = insert(node.right, key); 

        
        return node; 
    }
    static int maxDepth(node node) 
    { 
        if (node == null) 
            return 0; 
        else 
        { 
            int ld = maxDepth(node.left); 
            int rd= maxDepth(node.right); 

            if (ld> rd) 
                return (ld + 1); 
            else
                return (rd + 1); 
        } 
    } 
    
    static int maxHeight(int a[], int n) 
    { 
        node r1 = null; 
        r1 = insert(r1, a[0]); 
        for (int i = 1; i < n; i++)
        {
             root1 = insert(r1, a[i]); 
        }
        
        node r2 = null; 
        r2 = insert(r2, a[n - 1]); 
        for (int i = n - 2; i >= 0; i--) 
        {
            r2 =insert(r2, a[i]); 
        }
        
        int l = maxDepth(r1) - 1; 
        int m = maxDepth(r2) - 1; 

        return Math.max(l,m); 
    } 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.println(maxHeight(arr, n)); 
    } 
}
