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
// 		X<Y≤2⋅X.
        Scanner timtim = new Scanner(System.in);
        int T = timtim.nextInt();
        do{
            int X = timtim.nextInt();
            int Y = timtim.nextInt();
            System.out.println(X+2*Y);
        }while(--T>0);
        
	}
}
