/*Question 14: Write a java program to remove duplicated values from arrays.
Asked In Practice assignment
Input : Array = {10, 20, 20, 30, 40, 40, 50}
Output : Unique elements = {10, 20, 30, 40, 50}
Explanation:
Traverse the array, check if element already exists before adding to result, 
thus avoiding duplicates*/
import java.util.*;
class DuplicateArray{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a size");
		int n = sc.nextInt();
		int arr[]=new int[n];
		int arr2[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
				System.out.println("remove duplicate value");
		for(int i=0;i<arr.length;i++)
		{
			int count=0;

			for(int j=0;j<i;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					break;
				}
			}
					if(count==0)
		{
			System.out.println(arr[i]);
		}
		}
	}
}

/*import java.util.*;

class DuplicateArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Unique elements:");

        for (int i = 0; i < n; i++) {
            int count = 0;

            // Check only previous elements
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }

            if (count == 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
*/		