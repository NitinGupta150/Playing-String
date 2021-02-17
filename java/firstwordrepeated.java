import java.util.*;
class firstwordrepeated
{
	public static void main(String args[])
	{
		String s="My name my is name is hello";
		s=s.toLowerCase();
		String str[]=s.split(" ");
		LinkedHashMap<String,Integer>m=new LinkedHashMap<String,Integer>();
		
		for(String a:str)
		{
			if(m.get(a)==null)
				m.put(a,1);
			else
				m.put(a,(m.get(a)+1));
		}
		System.out.println(m);

		for(String s1:m.keySet())
		{
			if(m.get(s1)>1)
			{
				System.out.println("First Repeted word is: "+s1);
				System.exit(0);
			}
		}
	}
}