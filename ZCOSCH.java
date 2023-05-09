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
		int R = timtim.nextInt();
		if(1<=R && R<=50)
		{
		    System.out.println(100);
		}
		else if(51<=R && R<=100)
		{
		    System.out.println(50);
		}
		else
		{
		    System.out.println(0);
		}
	}
}
