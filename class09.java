package hw09;
class CCalculator        
{
   int a;           
   int b;
   int c;
   double w;
   void set_value(int x,int y,int z)
   {
      a=x;
      b=y;
      c=z;
   }
   void show()   
   {
	 System.out.println("a="+a);
     System.out.println("b="+b);
     System.out.println("c="+c);
   }
   void add()   
   {
	 System.out.println("©M"+a+b+c);
   }
   void sub()
   {
	 System.out.println(a-b-c);
   }
   void mul()
   {
	 System.out.println("­¼¿n="+a*b*c);
   }
   void avg()
   {
	 System.out.println("w="+(a+b+c)/3);
   }
}
public class class09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CCalculator Calculator;
		Calculator=new CCalculator();
		Calculator.set_value(25,3,7);
		Calculator.show();
		Calculator.add();
		Calculator.sub();
		Calculator.mul();
		Calculator.avg();

	}

}
