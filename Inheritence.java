class A 
{
 int i, j;
 void showij()
 {
 System.out.println("i and j: " + i + " " + j);
 }
}

class B extends A 
{
 int k;
 void showk()
 {
 System.out.println("k: " + k);
 }
 void sum()
 {
 System.out.println("i+j+k: " + (i+j+k));
 }
}
class Inheritence
{
 public static void main(String args [])
 {
 A superOb = new A();
 B subOb = new B();
 
 superOb.i = 30;
 superOb.j = 23;
 System.out.println("Contents of superOb: ");
 superOb.showij();
 System.out.println();
 subOb.i = 44;
 subOb.j = 21;
 subOb.k = 17;
 System.out.println("Contents of subOb: ");
 subOb.showij();
 subOb.showk();
 System.out.println();
 System.out.println("Sum of i, j and k in subOb:");
 subOb.sum();
 }
}