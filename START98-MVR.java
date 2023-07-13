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
		int A = timtim.nextInt();
		int B = timtim.nextInt();
		int X = timtim.nextInt();
		int Y = timtim.nextInt();
		
		int Messi = A*2 + B;
		int Rolando = X * 2 + Y;
		if(Messi==Rolando)
		{
		    System.out.println("Equal");
		}
		else if(Messi>Rolando)
		{
		    System.out.println("Messi");
		}
		else
		{
		    System.out.println("Ronaldo");
		}
	}
}
