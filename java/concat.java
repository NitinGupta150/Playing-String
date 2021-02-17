import java.util.Scanner;

class compare
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in)
		int n1,n2;
		System.out.println("Enter value of n for 1st array");
		n1=s.nextInt();
		System.out.println("Enter 2nd array");
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
		int c[]=new int[n2+n1];
        int i;
        for(i=0;i<n1;i++)
            c[i]=a[i]
        for(int j=0;j<n2;j++)
        {
            c[i]=b[j];
            i++;
        }
        System.out.println("Conacated array is: ");
        for(int i=0;i<n1+n2;i++)
            System.out.println(c[i]);

}