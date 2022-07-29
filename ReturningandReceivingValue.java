class Addition
{
	int a;
	int b;
	int add(int m,int n)
  {
    a=m;
	b=n;
	return a+b;
  }
}
    public class ReturningandReceivingValue
    {
     public static void main (String arg[])
      {
       Addition f = new Addition();
	   int c = f.add(23,78);
	  System.out.println(c);
      }
    }