//Giai phuong trinh bac nhat ax + b = 0
package BaiTap;
public class Bai1 
{
	public void Tinh(float a, float b)
	{
		if(a!=0)
		{
			float x = -b/a;
			System.out.println("Nghiem x cua phuong trinh " +a+ "x +" +b+ " = 0 la " +x);
		}
		else if (b!=0) System.out.println("Phuong trinh " +a+ "x +" +b+ " = 0 vo nghiem" );
		else System.out.println("Phuong trinh " +a+ "x +" +b+ " = 0 co vo so nghiem" );
	}
	public static void main(String [] s)
	{
		Bai1 dt = new Bai1();
		dt.Tinh(2,4);
		dt.Tinh(0,3);
		dt.Tinh(0,0);
	}

}