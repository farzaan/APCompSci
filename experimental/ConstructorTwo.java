//(c) A+ Computer Science
// www.apluscompsci.com

//constructor example 2

class Triangle
{
   private int sideA, sideB, sideC;

   public Triangle()
   {
      sideA=0;
      sideB=0;
      sideC=0;
   }

   public Triangle(int a, int b, int c)
   {
      sideA=a;
      sideB=b;
      sideC=c;
   }

   public void print()
   {
   	System.out.println(sideA + " " + sideB + " " + sideC);
   }
}

public class ConstructorTwo
{
  public static void main ( String[] args )
  {
    Triangle test = new Triangle(5,6,7);
    test.print();

    Triangle a = new Triangle(15,17,14);
    a.print();
    
    Triangle x = new Triangle(115,117,114);
    x.print();    
  }
}