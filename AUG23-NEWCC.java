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
		int X = timtim.nextInt();
		int Y = timtim.nextInt();
// 		System.out.println(X<=Y? "Old": "New");
        if(X<Y)
        {
            System.out.println("Old");
        }
        else if(X>Y)
        {
            System.out.println("New");
        }
        else
        {
            System.out.println("Same");
        }
	}
}
