/*Q1. Write a Java program to generate an N × N matrix filled with consecutive integers in clockwise spiral order. 
Input: N = 4 
Expected Output:  
1 2 3 4 
12 13 14 5
11 16 15 6
10 9 8 7 
*/
import java.util.*;
class Q1{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Display");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+"  ");
			}
			System.out.println();
		}
	}
}