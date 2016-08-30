import java.util.*;
class hunter6
{
	public static void main(String [] args)
	{
		Scanner S=new Scanner(System.in);
		System.out.println("Enter the count of the Array");
		int n=S.nextInt();
		System.out.println("Enter the elements");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=S.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					if(a[i]==a[j])
					{
						System.out.println("The repeated first element is "+a[i]);
						break;
					}
				}	
			}
		}
	}
}