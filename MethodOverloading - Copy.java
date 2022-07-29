class Addition
{
  int x,y,z;
  void add(int a,int b)
  {
    x=a;
	y=b;
   System.out.print(x+y);
  }
  void add(int a,int b,int c)
  {
  x=a;
  y=b;
  z=c;
  System.out.print(x+y+z);
  }
}
 public class MethodOverloading
 {
  public static void main(String arg[])
  {
   Addition p = new Addition();
   p.add(12,34);
   p.add(34,45,45);
  }
 }