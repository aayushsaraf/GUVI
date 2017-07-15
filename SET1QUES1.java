/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("ENTER THE NUMBER");
		int n=sc.nextInt();
		if(n>0)
		System.out.println("NUMBER IS POSITIVE");
		else if(n<0)
		System.out.println("NUMBER IS NEGATIVE");
	   else
	   System.out.println("WRONG INPUT");
	}
}