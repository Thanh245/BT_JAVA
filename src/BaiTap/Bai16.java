//Day fibonaci
package BaiTap;
public class Bai16 
{
	public void In(int n)
	{
		int f1, f2, f3;
		f1  = 1; f2 = 1;
		if (n > 1)
		{
			System.out.print(" 1 1");
			do
			{
				f3 = f2 + f1;
				f1 = f2; f2 = f3;
				if (f3 < n)
					System.out.print(" " +f3);
			}while(f3 < n);
		}
		
	}
	public static void main(String[] s)
	{
		Bai16 dt = new Bai16();
		dt.In(100);
	}
}
