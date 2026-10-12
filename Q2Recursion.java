/*Question 2: Write a java program to print all natural numbers in reverse (from n to 1). using a while loop.
Asked In Just Practice assignment
Input:

n = 5

Output:

5 4 3 2 1

Explanation:

The program starts from n and decreases the number by 1 each time.
The loop runs until the number becomes 1.*/
import java.util.*;
class Q2Recursion{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		print(n,1);
	}
	public static void print(int n,int x)
	{
		if(x>n)
		{
			return ;
		}
		System.out.print(n+"\t");
		print(n-1,x);
	}
}