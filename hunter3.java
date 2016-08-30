import java.util.*;
class hunter3
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the Array count");
		int n=S.nextInt();
		System.out.println("Enter the values");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		hunter3 h3=new hunter3();
		System.out.println(h3.equalindex(a));
	}
	public static String equalindex(int b[])
	{
		Arrays.sort(b);
		String r=new String();
		for(int i=0;i<b.length;i++)
		{
			if(i==b[i])
			{
				r="The number "+b[i]+" equals index "+i;
			}
		}
		return r;
	}
}