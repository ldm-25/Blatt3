package h2;

public class H2_main 
{
	public static void main (String args[])
	{
		int jahr = 1944;
		boolean schalt = false;
		
		if (jahr% 4== 0)
		{
			schalt = true;
			
			if (jahr%100 == 0)
			{
				schalt = false;
				
				if (jahr%400==0)
				{
					schalt = true;
				}
			}
		}
	if (schalt==true)
		{
		System.out.println(jahr+ "ist ein schaltjahr");
		}
	else
	{
		System.out.println(jahr + "ist kein schaltjahr");
	}
	
	
	}
	
	
}
