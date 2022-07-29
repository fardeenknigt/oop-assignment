public class throwskeyword
{
  static void checkcash(int cash) throws ArithmeticException 
  {
    if (cash<250000) 
	{
      throw new ArithmeticException("Access denied - You must be at least 250000.");
    }
    if (cash>250000)
	{
      System.out.println("Access granted ");
    }
  }

  public static void main(String[] args) 
  {
    checkcash(280000); 
  }
}