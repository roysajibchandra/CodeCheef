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
            int N = timtim.nextInt();
            int V1 = timtim.nextInt();
            int V2 = timtim.nextInt();

            double s = N* Math.sqrt(2);
            double e = N*2;

            double timeStairs = s/V1;
            double timeElevetor = e/V2;

            if(timeStairs<timeElevetor)
            {
                System.out.println("Stairs");
            }
            else
            {
                System.out.println("Elevator");
            }


        }
	}
}
