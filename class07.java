package hw07;

class CTest {
	int a;
	int b;
	int c;
	void set_value(int x,int y,int z) 
	{
		a= x;
		b= y;
		c= z;
	}
	void show1() {
	if(a == 0) {
		System.out.println(a+",计0");
	}  else {if (a % 2 == 0) {
		     System.out.println(a+",计案计");
	        }else {
	         System.out.println(a+",计计");
	        }
	}
	}
	void show2() {
		if(b == 0) {
			System.out.println(b+",计0");
		}  else {if (b % 2 == 0) {
			     System.out.println(b+",计案计");
		        }else {
		         System.out.println(b+",计计");
		        }
		}
		}
	void show3() {
		if(c == 0) {
			System.out.println(c+",计0");
		}  else {if (c % 2 == 0) {
			     System.out.println(c+",计案计");
		        }else {
		         System.out.println(c+",计计");
		        }
		}
		}
}
public class class07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CTest Test;
		int x;
		Test=new CTest();
		Test.set_value(3,8,0);
		Test.show1();
		Test.show2();
		Test.show3();
	}

}
