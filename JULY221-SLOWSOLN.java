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
		    int maxT = timtim.nextInt();
		    int maxN = timtim.nextInt();
		    int sumN = timtim.nextInt();
		    int r = 0;
		    int q = 0;
		    if(sumN/maxN >= maxT){
		        System.out.println(maxT*maxN*maxN);
		    } else if(sumN/maxN < maxT){
		        q = sumN/maxN;
		        r = sumN%maxN;
		        System.out.println(q*maxN*maxN + r*r);
		    }
		}
	}
}
