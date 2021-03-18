//So doi xung
package BaiTap;
public class Bai13 
{
	public void DoiXung(int n)
	{
		int tmp = n, m = 0;
		while (tmp > 0)
		{
			m = m*10 + tmp%10;
			tmp = tmp/10;
		}
		if (m == n) System.out.println(n+ " la so doi xung");
		else System.out.println(n+ " khong la so doi xung");
	}
	public static void main(String [] s)
	{
		Bai13 dt = new Bai13();
		dt.DoiXung(1243);
		dt.DoiXung(1221);
		dt.DoiXung(234432);
	}

}
