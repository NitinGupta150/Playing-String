import java.util.*;
class anagram
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1,s2;
		System.out.println("Entern string: ");
		s1=s.nextLine();
		System.out.println("Entern string: ");
		s2=s.nextLine();
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);     //important
		Arrays.sort(c2);
		if(c1.length==c2.length)
		{
			for(int i=0;i<c1.length;i++)
			{
				if(c1[i]!=c2[i])
				{
					System.out.println("Not anagram");
					System.exit(0);
				}
			}
			System.out.println("Anagram");
		}
		else
			System.out.println("Not Anagram");
	}
}