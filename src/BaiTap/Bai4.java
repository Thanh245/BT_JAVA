//Tinh tien karaoke
package BaiTap;
public class Bai4 
{
	public void Tinh (int a, int b)
	{
		if (a>24 || b>24) System.out.println ("Ban da nhap sai so gio");
		else
		{
			int t = 0;
			if (0<=a && a<=b) t = b - a;
			else if (0<=a && b<=a) t = b + 24 -a;
			if (t < 18) System.out.println ("So tien thanh toan la: " +t*45+ " nghin dong");
			else System.out.println ("So tien thanh toan la: " +t*60+ " nghin dong");
		}
	}
	public static void main(String [] s)
	{
		Bai4 dt = new Bai4();
		dt.Tinh(7,19);
		dt.Tinh(5,24);
		dt.Tinh(19,3);
		dt.Tinh(15, 25);
	}
}
