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
		    int Y = timtim.nextInt();
		    
		    int res = ((X+Y)%2==0)? (X+Y)/2: -1;
		    System.out.println(res);
		    
		  //  if((X+Y)%2==0)
		  //  {
		  //      System.out.println((X+Y)/2);
		  //  }
		  //  else
		  //  {
		  //      System.out.println(-1);
		  //  }
		}while(--T>0);
	}
}
