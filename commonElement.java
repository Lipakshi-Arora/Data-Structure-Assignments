//Given three arrays sorted in non-decreasing order, print all common elements in these
//arrays.

package practice;
import java.util.*;

public class commonElement 
{
    public static void main(String args[])
    {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=sc.nextInt();
        }
        n2=sc.nextInt();
        int arr2[]=new int[n2];
         for(int i=0;i<n2;i++)
        {
            arr2[i]=sc.nextInt();
        }
        n3=sc.nextInt();
        int arr3[]=new int[n3];
        for(int i=0;i<n3;i++)
        {
            arr3[i]=sc.nextInt();
        }
        int i=0,j=0,k=0;
        while (i < n1 && j < n2 && k < n3) 
        {
         if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) 
         {
            System.out.print(arr1[i] + " ");
            i++;
            j++;
            k++;
         }
         else if (arr1[i] < arr2[j]) 
         {
            i++;
         }
         else if (arr2[j] < arr3[k]) 
         {
            j++;
         }
         else 
         {
            k++;
         }
        } 
    }
    
}
