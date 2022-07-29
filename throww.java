public class throww
{
  static void checkcash (int cash) 
  {
    if (cash < 250000) 
	{
      throw new ArithmeticException("Access denied - You must be at 250000");
    }
    if (cash >250000)
	{
      System.out.println("Access granted ");
    }
  }

  public static void main(String[] args) 
  {
    checkcash(30000); 
  }
}