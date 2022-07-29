class Addition
{
	 int a,b;
	 Addition()
	 {
		 a=10;
		 b=10;
	 }
	 Addition(int x,int y)
	 {
	  a=x;
	  b=y;
	 }
}
public class ConstructorOverload
 {
  public static void main (String arg[])
   {
   Addition p = new Addition();
   Addition q = new Addition(20,20);
   System.out.print(p.a+p.b);
   System.out.print(q.a+q.b);
   }
 }