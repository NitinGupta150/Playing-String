import java.util.*;
class hashmap
{
	public static void main(String args[])
	{
		String s="abcc";
		char []c=s.toCharArray();
		System.out.println(s);

        	HashMap<Character,Integer>m=new HashMap<Character,Integer>();
        	for(int i=0;i<c.length;i++)
        	{
            		if(m.get(c[i])==null)
                		m.put(c[i],1);
            		else
                		m.put(c[i],(m.get(c[i])+1));
        	}
		System.out.println(m);
		int max=0;
		for(Character r:m.keySet())
		{
			if(max<m.get(r))
			{
				max=m.get(r);
			}
		}
		int min=max;
		for(Character r:m.keySet())
		{
			if(min>m.get(r))
			{
				min=m.get(r);
			}
		}
		System.out.println(min);
	}
}