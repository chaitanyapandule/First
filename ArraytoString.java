import java.util.*;
class ArraytoString{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter element in array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		String str = new String(a,0,a.length);
		System.out.println(str);
	}
}
