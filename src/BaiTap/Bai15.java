//In ra ca cso hoan hao nho hon 1000
package BaiTap;
public class Bai15 
{
	public void In (int n)
	{
		int i, j, sum;
		for (i = 2; i <= n; i++)
		{
			sum = 1;
			for (j = 2; j <= i/2; j++)
			{
				if (i%j == 0) sum += j;
			}
			if (sum == i) System.out.println(" " +i);
		}
	}
	public static void main (String s[])
	{
		Bai15 dt = new Bai15();
		dt.In(1000);
	}
}
