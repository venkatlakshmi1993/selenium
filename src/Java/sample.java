package Java;

public class sample {
	public static void main(String[] args)
	{
		int no=7;
		int count=0;
		for(int i=2;i<no;i++)
		{
		if (no%i==0)
			{
				count++;
				System.out.println(count);
				break;
			}
		
		System.out.println(count);
		}
	
		if(count>0)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println("prime");
		}	
			
	}	
		}