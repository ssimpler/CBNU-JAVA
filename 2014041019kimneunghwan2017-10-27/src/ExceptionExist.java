class ExceptionExist 
{
	public static void main(String[] args) 
	{
		func();                 //�޼ҵ� ȣ��
	}
	
	static void func() 
	{
		int i = 1;
		int j = 0;
		System.out.println(i/j);    // 1�� 0���� ������. ���� �߻�
	}
}
