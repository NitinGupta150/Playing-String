import java.util.*;
class duplicatewordsinstring
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		String s1;
		s1=s.nextLine();
		String str[]=s1.toLowerCase().split(" ");
		HashMap<String,Integer>m=new HashMap<String,Integer>();
		for(String a:str)
		{
			if(m.get(a)==null)
				m.put(a,1);
			else
				m.put(a,(m.get(a)+1));
		}
		for(String s2:m.keySet())
		{
			if(m.get(s2)>1)
				System.out.println(s2+" "+m.get(s2));
		}
		//System.out.println(m);
	}
}