/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static Scanner timtim = new Scanner(System.in);
    
    public static void solve()
    {
        int T = timtim.nextInt();
		while(T-->0){
		    int N = timtim.nextInt();
		    String S= timtim.next();
		    int flag=1;
		    for(int i=0;i<N-1;i++){
		        for(int j=i+1;j<N;j++){
		            if(S.charAt(i)==S.charAt(j)){
		                flag=0;
		                break;
		            }
		        }
		    }
		  //  if(flag==0){
		  //      System.out.println(N-2);
		  //  }
		  //  else{
		  //      System.out.println(-1);
		  //  }
		  //short
		  System.out.println(flag==0? N-2: -1);
		}
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		
		solve();
	}
}
