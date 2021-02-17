import java.util.*;
class stringrotation
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1,s2;
		System.out.println("Enter 1st String: ");
		s1=s.nextLine();
		System.out.println("Enter 2nd String: ");
		s2=s.nextLine();
		if((s1.length()==s2.length()) && ((s1+s1).indexOf(s2)!=-1))
		{
			System.out.println("Strings are rotation of one another");
			//System.out.println(s1+s2);
			//System.out.println((s1+s2).indexOf(s2));
		}
		else
			System.out.println("Strings are not rotation of one another");
	}
}