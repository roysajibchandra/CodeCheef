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
		    int A = timtim.nextInt();
		    int B = timtim.nextInt();
		    int C = timtim.nextInt();
		    int D = timtim.nextInt();
		    int max = Math.max(Math.max(A, B), Math.max(C, D));
		    int min = Math.min(Math.min(A, B), Math.min(C, D));
		    int count=0;
		    for(int i=min; i<=max; i++)
		    {
		        if( (A<=i && i<=B)|| (C<=i && i<=D) )
		        count++;
		    }
		    System.out.println(count);
		}while(--T>0);
	}
}
