//Tinh S = 1 + 1/3! + 1/5! + ... + 1/(2*n-1)!
package BaiTap;
public class Bai8
{
	public void Tinh (int n)
	{
		float S = 0;
		int mau = 1, i = 1;
		while (i <= 2*n - 1)
		{
			S = (float) (S +1.0/mau);
			i = i + 2;
			mau = mau*i*(i-1);
		}
		System.out.println("S = 1 + 1/3! + 1/5! + ... + 1/(2*"+n+"-1)! = "+S);
	}
	public static void main(String [] s)
	{
		Bai8 dt = new Bai8();
		dt.Tinh(5);
	}
}
