//Tinh S = 1 + 1/2 + 1/3 + ... + 1/n
package BaiTap;
public class Bai6
{
	public void Tinh (int n)
	{
		float S = 0;
		for (int i = 1; i <=n; i++)
		{
			S = (float) (S + 1.0/i);
		}
		System.out.println("S = 1 + 1/2 + 1/3 + ... + 1/"+n+ " = "+S);
	}
	public static void main(String [] s)
	{
		Bai6 dt = new Bai6();
		dt.Tinh(20);
	}
}
