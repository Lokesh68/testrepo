
public class Convert {

	
	public void DToB(int num)
	{
		StringBuffer bin=new StringBuffer();
		while(num>0)
		{
			if(num%2==0)
			{
				bin.append("0");
			}
			else
			{
				bin.append("1");
			}
			num=num/2;
			
		}
		System.out.println(bin.reverse());
		
	}
	public void BToD(long num)
	{
		int sum =0;
		int pow=0;
	    while(num>0)
	    {
	    	sum=sum+(int)Math. pow((num%10)*2, pow);
	    	System.out.println(num%10);
	    	num=(int)num/10;
	    	pow++;
	    }
	    System.out.println(sum);
	}
}
