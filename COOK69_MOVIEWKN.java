/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner timtim = new Scanner(System.in);
		int T = timtim.nextInt();
		while(T-->0)
		{
		    int n=timtim.nextInt(),i,max=0;
		    int l[]=new int[n];
		    int r[]=new int[n];
		    int lr[]=new int[n];
		    for (i=0; i<n; i++) l[i]=timtim.nextInt();
		    for (i=0; i<n; i++)
		    {
		        r[i]=timtim.nextInt();
		        lr[i]=l[i]*r[i];
		    }
		    for (i=1; i<n; i++)
		        if(lr[i]>lr[max]||(lr[i]==lr[max]&&r[i]>r[max]))
		            max=i;
		    System.out.println(max+1);
		}
	}
}
