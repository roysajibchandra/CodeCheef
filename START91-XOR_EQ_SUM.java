/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
import java.math.BigInteger;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	 Scanner Sc=new Scanner(System.in);
        int tc=Sc.nextInt();
        while (tc-->0) {
            BigInteger l = Sc.nextBigInteger();
            BigInteger r = Sc.nextBigInteger();
            BigInteger ans = BigInteger.ZERO;
            if (l.equals(BigInteger.ZERO))
                ans = ans.add(BigInteger.ONE);
            BigInteger p = BigInteger.ONE;
            while (p.compareTo(r) <= 0) {
                if (p.compareTo(l) >= 0)
                    ans = ans.add(p.subtract(l));
                p = p.multiply(BigInteger.valueOf(2));
            }
            System.out.println(ans);
        }
	}
}
