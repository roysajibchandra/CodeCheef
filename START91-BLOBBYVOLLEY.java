/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for (int i=0; i<t ;i++)
		{
		    int n = sc.nextInt();
		   //String[] s = new String[n];
		   String s = sc.next();
		    int a=0;
		    int b=0;
		    
		  //  for(int j=0; j<n ; j++)
		  //  {
		  //      s.charAt(j) = sc.next();
		  //  }
		    
		    if(s.charAt(0) == 'A')
		    a++;
		    
		    else
		    b=0;
		    
		    for(int j=1; j<n; j++)
		    {
		        if(s.charAt(j)=='A')
		        {
		            if(s.charAt(j-1) == 'A')
		            a++;
		            
		            
		            
		        }
		        
		        else
		        {
		            if(s.charAt(j-1) == 'B')
		            b++;
		            
		        }
		    }
		    System.out.println(a+" "+b);
		    
		}
	}
}
