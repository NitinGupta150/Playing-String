import java.util.*;
class firsthalfasscending
{
	public static void main(String args[])
	{
		char ch[]={'a','b','c','d','e','f','g','i'};
		int len=ch.length;
		int i;
		char c1[]=new char[len/2];
		char c2[]=new char[len-len/2];
		for(i=0;i<len/2;i++)
		{
			c1[i]=ch[i];	
		}
		for(int j=0;j<len-len/2;j++)
		{
			c2[j]=ch[i];
			i++;
		}
		Arrays.sort(c2);
		Arrays.sort(c1);
		for(i=0;i<len/2;i++)
		{
			ch[i]=c1[i];	
		}
		for(int j=len-len/2-1;j>=0;j--)
		{
			ch[i]=c2[j];
			i++;
		}
		System.out.println("Sort first half of an array in ascending and second half in descending order");
		for(char temp:ch)
			System.out.println(temp);
	}
}