import java.util.*;
class Q6{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n= sc.nextInt();
	    int temp=n;
		int count=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
		}
		temp=n;
		int sum=0;
		while(temp>0)
		{
			int rem=temp%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
			sum=sum+power;
			temp=temp/10;
		}
		if(sum==n)
		{
			System.out.println("Number is Amstrong");
		}
	}
}