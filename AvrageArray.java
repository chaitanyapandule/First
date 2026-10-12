/*Question 16: Write a Java program to calculate the average 
of all elements present in an integer array.
Asked In Practice assignment
Input Array:
[10, 20, 30, 40, 50]
Output:
Average of array elements = 30Explanation
? The average of array elements is calculated by:
Average=Sum of all elementsNumber of elements\text{Average} = \frac{\text{Sum of all elements}}
{\text{Number of elements}}Average=Number of elementsSum of all elements
? First, iterate through the array and add all elements to a variable sum.
? Then divide sum by the total number of elements (array.length) to get the average.*/
import java.util.*;
class AvrageArray{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[]= new int [n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int count=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			count++;
		 sum=sum+arr[i];
		}
		int avrg=sum/count;
		System.out.println(avrg+" ");
	}
}


