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
		while(T>0){
		    int w1 = timtim.nextInt();
		    int w2 = timtim.nextInt();
		    int x1 = timtim.nextInt();
		    int x2 = timtim.nextInt();
		    int M = timtim.nextInt();
		    
		    if((w2-w1)<(M*x1))
		        System.out.println(0);
		    else if((w2-w1)>(M*x2))
		        System.out.println(0);
		    else
		        System.out.println(1);
		    
		    T--;
		}
	}
}
