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
		while(T--> 0)
		{
		    int N = timtim.nextInt();
		    int count=0;
		    
		    while(N>50 || N<50) {
		       if(N>50) {
		           N-=3;
		           count++;
		       }
		       if(N<50) {
		           N+=2;
		           count++;
		       }
		       
		    }
		    System.out.println(count);
		}
	}
}
