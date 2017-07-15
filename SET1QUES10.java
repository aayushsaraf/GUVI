/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int sum=0;
		Scanner sc=new Scanner(System.in);  
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		String s=Integer.toString(n);
		int length=s.length();
                if(s.charAt(0)=='-')
                length++;
	    System.out.println(length);
		
	}
}