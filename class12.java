package hw12;
class CWin                    // �w�q���OCCircle
{
   String name;
   int width;
   int height;
   int w;
   int h;
   String s;
   void set_value(int x,int y,String z) {
	   w = x;
	   h = y;
	   s = z;
   }
   void setW(int W)          // �]�wcolor����
   {
	   width=w;
   }
   void setH(int H)         // �]�wradius����
   {
	   height=h;
   }
   void setName(String s)   // �P�ɳ]�wcolor�Pradius
   {
      name=s;
   }
   public void show()
   {
      System.out.println("Name="+name);
      System.out.println("W="+width+", H="+height);
   }
}

public class class12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	      CWin cw=new CWin();
	      cw.setName("Wy Windows");
	      cw.setW(5);
	      cw.setH(3);
	      cw.show();
	}

}
