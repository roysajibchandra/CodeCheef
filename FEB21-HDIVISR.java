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
		int N = timtim.nextInt();
		int sum = 0;
		for(int i=1; i<=10; i++)
		{
		    if(N%i==0)
		    {
		        sum = i;
		    }
		}
		System.out.println(sum);
	}
}
