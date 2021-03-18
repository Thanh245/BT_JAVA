//In ra cac so nguyen to nho hon hoac bang so n cho truoc
package BaiTap;
public class Bai14 
{
	public void In(int n)
	{
		for (int i = 1; i<= n; i++)
		{
			int nto = 1;
			for (int j = 2; j <= Math.sqrt(i); j++)
			{
				if(i%j == 0) nto = 0;
			}
			if (nto == 1) System.out.println(" " +i);
		}
	}
	public static void main (String [] s)
	{
		Bai14 dt = new Bai14();
		dt.In(1000);
	}
}
