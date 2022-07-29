class Addition
{
  int a;
  int b;
  void add(int m,int n)
  {
   a=m;
   b=n;
   System.out.println(a+b);
  }
}
    public class Parametrize
    {
     public static void main (String arg[])
      {
       Addition f = new Addition();
	   f.add(23,56);
      }
    }