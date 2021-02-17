import java.util.Scanner;
class compare
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		int n1,n2;
		System.out.println("Enter value of n for 1st array");
		n1=s.nextInt();
		System.out.println("Enter 1st array");
		int a[]=new int[n1];
		for(int i=0;i<n1;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Enter value of n for 2nd array");
		n2=s.nextInt();
		System.out.println("Enter 2nd array");
		int b[]=new int[n2];
		for(int i=0;i<n2;i++)
		{
			b[i]=s.nextInt();
		}
		if(n1==n2)
		{
			for(int i=0;i<n1;i++)
			{
				if(a[i]!=b[i])
				{	
					System.out.println("Array Elements are not equal");
					return;
				}
			}
			System.out.println("Array Elements are equal");
		}
		else
			System.out.println("Array Elements are not equal");
	}
}