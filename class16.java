package hw16;
class CSphere
{
	private int x;
	private int y;
	private int z;
	private int radius;
	private double pi=3.14;
	void setLocation(int i, int j, int k)
	  {
	   x=i;                // int x=i ����b�ŧi�@��x�ܼ� ���U�L�X�Ӫ��Ʀr�O�w�]��0 �G���঳int  (int x�O�޼Ƥŧ�)
	   y=j;
	   z = k;
	  }
	void setRadius(int r)
	   {
	    radius=r;
	   }
	   double surfaceArea()
	   {
	    return (double)4*3.1416*radius*radius;
	   }
	   double volume()
	   {
	    return ((double)3.1416*radius*radius);
	   
	   }
	   void showCenter()
	   {
	    System.out.println("Circle center"+"x="+x+" "+"y="+y+" "+"z="+z+" "+"�b�|="+radius);
	   }
	
}
public class class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere Sphere;
		Sphere = new CSphere();
		Sphere.setLocation(3,4,5);
		Sphere.setRadius(1);
		System.out.println("���n="+Sphere.surfaceArea());
		Sphere.showCenter();
	}

}
