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
		    int X = timtim.nextInt();
		    int Y = timtim.nextInt();
		    String S = timtim.next();
		    int count1=0, count0=0;
		    
		    for(int i=0; i<N; i++)
		    {
		        if(S.charAt(i)=='1')
		        {
		            count1++;
		        }
		        else
		        {
		            count0++;
		        }
		    }
		    if(count0==0 || count1==0)
		    {
		        System.out.println(0);
		    }
		    else{
		        System.out.println(X>Y? Y: X);
		    }
		}
	}
}
