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
		System.out.println(a+",���Ƭ�0");
	}  else {if (a % 2 == 0) {
		     System.out.println(a+",���Ƭ�����");
	        }else {
	         System.out.println(a+",���Ƭ��_��");
	        }
	}
	}
	void show2() {
		if(b == 0) {
			System.out.println(b+",���Ƭ�0");
		}  else {if (b % 2 == 0) {
			     System.out.println(b+",���Ƭ�����");
		        }else {
		         System.out.println(b+",���Ƭ��_��");
		        }
		}
		}
	void show3() {
		if(c == 0) {
			System.out.println(c+",���Ƭ�0");
		}  else {if (c % 2 == 0) {
			     System.out.println(c+",���Ƭ�����");
		        }else {
		         System.out.println(c+",���Ƭ��_��");
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
