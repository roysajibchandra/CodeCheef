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
            int L = timtim.nextInt();
            int R = timtim.nextInt();
            int M = timtim.nextInt();
            int page = (M%L==0)? M/L: M/L+1;
            int line = M/R;
            System.out.println(page+line);

        }
	}
}
