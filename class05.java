package hw05;
class CBox        // �w�qCRectangle���O
{
	int length;
	int width;
	int height;
	void volume()   // 定義成員函數volume(), 用來計算體積
	   {
		  System.out.println(length*width*height);      // 傳回箱子的體積
	   }
	void surfaceArea()   // 定義成員函數volume(), 用來計算體積
	   {
		 System.out.println(length*width*2+height*length*2+width*height*2);      // 傳回箱子的表面積
	   }
	void showData()   // 定義成員函數volume(), 用來計算體積
	   {
		 System.out.println("length="+length);
	     System.out.println("width="+width);
	     System.out.println("height="+height);
	   }
	void showall()       // show_all() method,同時顯示出半徑與圓面積
	  {
	     showData();          // 於類別內呼叫show_area() method
	     volume();
	     surfaceArea();
	  }
}
public class class05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CBox box;
		box=new CBox();
		box.length=1;
		box.width=1;
		box.height=1;
		box.volume();
		box.surfaceArea();
		box.showData();
		box.showall();

	}

}
