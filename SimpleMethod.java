class Addition
{
	int x;
	int y;
	void add()
	{
		System.out.println(x+y);
	}
}
public class SimpleMethod
{
	public static void main (String arg[])
	{
	Addition f = new Addition();
	f.x=2;
	f.y=55;
	f.add();
	}
}