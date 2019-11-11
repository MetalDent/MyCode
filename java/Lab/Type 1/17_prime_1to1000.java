class q17
{
	public static void main(String[] args) 
    {
    	int i,flag=0;
    	for(i=2;i<=1000;i++)
    	{
    		flag=0;
    		for(int j=2;j<i;j++)
    		{
    			if(i%j==0)
    				flag=1;
    		}
    		if(flag==0)
    			System.out.println(i);
    	}
     }
}