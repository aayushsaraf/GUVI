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
		System.out.println("ENTER THE CHARACTER");
		char n=sc.next().charAt(0);
		if(n=='a'||n=='e'||n=='i'||n=='o'||n=='u'||n=='A'||n=='E'||n=='I'||n=='O'||n=='U')
		System.out.println("CHARACTER IS VOWEL");
		else
	   System.out.println("CHARACTER IS CONSONANT");
	}
}