import java.util.*;
class highestoccuranceinstring
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String str;
		str=s.nextLine();
		char c[]=str.toCharArray();
		HashMap<Character,Integer>m=new HashMap<Character,Integer>();
		for(Character ch:c)
		{
			if(m.get(ch)==null)
				m.put(ch,1);
			else
				m.put(ch,(m.get(ch)+1));
		}
		int max=0;
		Character temp=' ';
		for(Character ch:m.keySet())
		{
			if(max<m.get(ch))
			{
				max=m.get(ch);
				temp=ch;
			}
		}
		System.out.println("Highest Occurance of character is:"+temp+","+max+" times");
	}
}