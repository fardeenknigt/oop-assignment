class Arrayy
{
	public static void main (String arg[])
	{
		int m[]= new int[7];
		int b=10;
		for (int i=0;i<m.length;i++)
		{
			m[i]=b;
			b=b+100;
		} 
		for (int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}
}	