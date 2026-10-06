/*Question 9: Write a java program to copy one array to another array.
Asked In Practice assignment
Input : Array1 = {5, 10, 15, 20}
Output : Array2 = {5, 10, 15, 20}
Explanation:
Copy each element of Array1 into Array2 using index-by-index assignment*/
import java.util.*;
class CopyArray{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [4];
		int arr2[] = new int [4];
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		//Copy array//
		
		for(int i=0;i<arr.length;i++){
			arr2[i]=arr[i];
			System.out.println(arr2[i]+" ");
		}
	}
}