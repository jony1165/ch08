package hw12;
class CWin                    // 定義類別CCircle
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
   void setW(int W)          // 設定color成員
   {
	   width=w;
   }
   void setH(int H)         // 設定radius成員
   {
	   height=h;
   }
   void setName(String s)   // 同時設定color與radius
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
