/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	   Scanner timtim = new Scanner (System.in);
	   String name = timtim.nextLine();
	   System.out.println(name);
	   boolean flag = false;

	   for(int i=0; i<name.length()/2; i++)
	   {
		int n = name.length();
		if(name.charAt(i) == name.charAt(n-1-i))
		{
			// System.out.println("String is Palindrome");
			flag = true;
		}
		
	   }
	   if(flag)
	   {
		System.out.println("String is Palindrome");
	   }
	   else{
		System.out.println("Not Palindrome");
	   }
	   
	   
	}
	}

