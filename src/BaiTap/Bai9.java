//Tinh n!!
package BaiTap;
public class Bai9 
{
	public void Tinh(int n)
	{
		int i, kq;
		if(n%2 == 0)
		{
			kq =1;
			for (i = 2; i <=n; i = i+2)
			kq = kq*i;			 
		}
		else 
		{
			kq = 1;
			for (i = 1; i <=n; i = i+2)
			{
				kq = kq*i;
			}
		}
		System.out.println("Giai thua kep " +n+ "!!=" +kq);
	}
	public static void main (String s[])
	{
		Bai9 dt = new Bai9();
		dt.Tinh(4);
		dt.Tinh(7);
	}

}