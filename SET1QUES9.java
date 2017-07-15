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
		for(int j=0;j<n;j++)
		{
			sum=sum+sc.nextInt();
		}
	
		System.out.println(sum);
		
	}
}