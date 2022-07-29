class Addition
{
  int a;
  int b;
  int add()
  {
   return a+b;
  }
}
    public class ReturningValue
    {
     public static void main (String arg[])
      {
       Addition f = new Addition();
	   f.a=34;
	   f.b=26;
	  System.out.println(f.add());
      }
    }