class ExceptionProblem 
{
	public static void main(String[] args) 
	{
		int[] ar = {10,20,30};
		try
		{
			for(int i=0 ; i <= 4 ; i++)
			{
				System.out.println("ar[" + i + "] : " + ar[i]);	
			}
		}	
		catch (Exception e)
		{
			System.out.println("���ܰ� �߻��߽��ϴ�.");	
		}
		finally 
		{
			System.out.println("==================================");
			System.out.println("���� �߻����ο� ������� ����˴ϴ�.");  
		}		
	}
}
