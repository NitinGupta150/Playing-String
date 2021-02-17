import java.util.*;
class space
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1;
		System.out.println("Enter a string: ");
		s1=s.nextLine();
		String []s2=s1.split(" ");
		//System.out.println(s1);
		String str1="";
		for(String str:s2)
		{
			str1=str1+str;			//appendin a string after removing white space
			//System.out.println(str+"\n");
		}
		System.out.println(str1);
		System.out.println("Number of white spaces are: "+(s2.length-1));
	}
}