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
		    String sk = ((A*B)<0 || (A*C)<0 || (B*C)<0)? "YES": "NO";
		    System.out.println(sk);
		}while(--T>0);
	}
}
