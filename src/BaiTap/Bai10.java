//Tinh tong, tich cac chu so cua mot so cho truoc
package BaiTap;
public class Bai10
{
	public void Tinh (int m)
	{
		int s = 0, p = 1;
		System.out.println("So " +m+ " co"); 
		while (m!=0)
		{
			s += m%10;
			p *= m%10;
			m  = m/10;
		}
		System.out.println("Tong cac chu so la " + s );
		System.out.println("Tich cac chu so la " + p );
	}
	public static void main(String [] s)
	{
		Bai10 dt = new Bai10();
		dt.Tinh(2019);
		dt.Tinh(1234);
	}

}
