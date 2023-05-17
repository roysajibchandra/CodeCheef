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
		    int H = timtim.nextInt();
		    int X = timtim.nextInt();
		    int Y = timtim.nextInt();
		    if(H-Y<=0)
		    {
		        System.out.println(1);
		    }
		    else{
		        int specialattackcombo= (int)(Math.ceil((double)(H-Y)/X))+1;
		        System.out.println(specialattackcombo);
		    }
		}
	}
}
