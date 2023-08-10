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
		    int N = timtim.nextInt();
		    int[] Ni = new int[N];
		    int count=0;
		    for(int i =0; i<Ni.length; i++)
		    {
		       Ni[i] = timtim.nextInt();
		       if(Ni[i]%2!=0)
		            count++;
		    }
		    if(count%2!=0 && N>1) 
		        System.out.println(2);
		    else
		        System.out.println(1);
		}
	}
}
