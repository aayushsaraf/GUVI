/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);  
		System.out.println("ENTER THE THREE NUMBERS");
		int n=sc.nextInt();
		int m=sc.nextInt();
		int o=sc.nextInt();
		int ar[]=new int[3];
		ar[0]=n;
		ar[1]=m;
		ar[2]=o;
		for(int i=0;i<2;i++)
	    {
	    if(ar[i]>ar[i+1])
	    {
	    	int temp=ar[i];
	    	ar[i]=ar[i+1];
	    	ar[i+1]=temp;
	    	
	    	
	    }
	    }
	    System.out.println("LARGEST NUMBER IS "+ar[2]);
	    	
	    }
	
}
