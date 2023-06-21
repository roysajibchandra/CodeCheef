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
            int X = timtim.nextInt();
            int[] fruits = new int[3];
            for (int i = 0; i < fruits.length; i++)
            {
                fruits[i] = timtim.nextInt();
            }
            Arrays.sort(fruits);
            int sum = (X-1)*fruits[0]+fruits[1];
            System.out.println(sum);
        }
	}
}
