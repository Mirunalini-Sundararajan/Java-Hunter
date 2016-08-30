import java.util.*;
class hunter28
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=S.next();
		char ch[]=s.toCharArray();
		Set ss=new LinkedHashSet();
		for(int i=0;i<ch.length;i++)
		{
			ss.add(ch[i]);
		}
		Iterator iterator=ss.iterator();
		while(iterator.hasNext())
		{
			System.out.print(iterator.next());
		}
	}
}