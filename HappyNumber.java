import java.util.*;
class HappyNumber{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int n = sc.nextInt();
		int temp=n;
		while(n!=0 && n!=4)
		{
		   int sum=0;
		 while(n>0)
		 {
		  int rem=n%10;
          sum=sum+rem*rem;
          n=n/10;		  
		 }
		 n=sum;
		}
		if(n==1)
		{
			System.out.println("Number is HappyNumber");
		}else{
			System.out.println("Number is not HappyNumber");
		}
	}
}
