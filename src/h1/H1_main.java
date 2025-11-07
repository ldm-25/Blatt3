package h1;

public class H1_main 
{
	public static void main (String args[])
	{
		double guthaben = 12.5;
		double monEingang = 264.05;
		int rating = 0;
		boolean warnhinweis, negativ;
		
		if( guthaben<0)
		{
			negativ = true;
			
			
			if(Math.abs(guthaben)>monEingang)
			{
				rating-=1;
				if (rating<0)
				{
					warnhinweis=true;
				}
				else
				{
					warnhinweis= false;
				}
			
			}
			else
			{
				rating+=1;
			}
		}
		else if(guthaben>0)
		{
			rating+=3;
		}
		else if(guthaben==0)
		{
			rating+=2;
		}
		else
		{
			warnhinweis = false;
		}
	}

}
