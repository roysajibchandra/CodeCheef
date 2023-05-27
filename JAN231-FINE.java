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
		do{
		    int X = timtim.nextInt();
		    if(X<=70)
		    {
		        System.out.println(0);
		    }
		    else if(X<=100)
		    {
		        System.out.println(500);
		    }
		    else
		    {
		        System.out.println(2000);
		    }
		}while(--T>0);
	}
}
