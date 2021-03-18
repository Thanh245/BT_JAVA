//So nguyen to
package BaiTap;
public class Bai11 
{
	public void Nto(int n)
	{
		int i, nto = 1;
		if (n == 1) System.out.println(n+ " khong la so nguyen to");
		else
		{
			for (i = 2; i <= Math.sqrt(n); i++)
			{
				if(n%i == 0) nto = 0;
			}
		}
		if (nto == 1) System.out.println(n+ " la so nguyen to");
		else System.out.println(n+ " khong la so nguyen to");
	}
	public static void main (String [] s)
	{
		Bai11 dt = new Bai11();
		dt.Nto(9);
		dt.Nto(7);
	}

}
