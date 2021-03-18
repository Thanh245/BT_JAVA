//Tinh S = 15 - 1 + 1/2! - 1/3! + ... + (-1)^n*1/n!
package BaiTap;
public class Bai7 
{
	public void Tinh (int n)
	{
		float S = 15;
		int mau = 1;
		for (int i =1; i <=n; i++)
		{
			mau *=i;
			if (i%2 == 0) S = (float) (S +1.0/mau);
			else S = (float) (S - 1.0/mau);
		}
		System.out.println("S = 15 - 1 + 1/2! - 1/3! + ... + (-1)^"+n+"*1/"+n+"!= "+S);
		
	}
	public static void main(String [] s)
	{
		Bai7 dt = new Bai7();
		dt.Tinh(5);
	}
}
