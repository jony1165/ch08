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
	   x=i;                // int x=i 单x跑计 ┏ㄓ计琌箇砞0 珿ぃΤint  (int x琌ま计づа)
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
	    System.out.println("Circle center"+"x="+x+" "+"y="+y+" "+"z="+z+" "+"畖="+radius);
	   }
	
}
public class class16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CSphere Sphere;
		Sphere = new CSphere();
		Sphere.setLocation(3,4,5);
		Sphere.setRadius(1);
		System.out.println("縩="+Sphere.surfaceArea());
		Sphere.showCenter();
	}

}
