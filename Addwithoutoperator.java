import java.io.*; 
import java.util.*;
class Addwithoutoperator  
{ 
    static int Add(int x, int y) 
    {  
        while (y != 0)  
        { 
            int carry = x & y; 
  
            x = x ^ y; 
            y = carry << 1; 
        } 
        return x; 
    } 
    public static void main(String arg[])  
    { 
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=Add(a,b);
        System.out.println(c);
    } 
} 