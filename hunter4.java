import java.util.*;
class hunter4
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the array count");
		int n=S.nextInt();
		int a[]=new int[n];
		int c=0;
		System.out.println("Enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			c=0;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(a[i]==a[j])
					{
						c++;
					}
				}
			}
			if(c==0)
			{
				System.out.println(a[i]);
			}
		}
	}
}