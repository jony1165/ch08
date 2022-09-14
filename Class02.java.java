class CRectangle        // �w�qCRectangle���O
{
   double x;           // �ŧi��Ʀ���width
   double y;             // �ŧi��Ʀ���height
}

public class app8_1
{
   public static void main(String args[])
   {
      CRectangle rect1;
      rect1=new CRectangle(); // �إ߷s������

      rect1.width=20;      // �]�w�x��rect1���e
      rect1.height=15;     // �]�w�x��rect1����

      System.out.println("width="+rect1.width);    // �L�Xrect1.width
      System.out.println("height="+rect1.height);    // �L�Xrect1.height
   }
}

/* app8_1 OUTPUT---
width=20
height=15
-----------------*/