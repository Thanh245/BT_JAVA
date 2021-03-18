//Kiem tra n co thuoc day fibo khong
package BaiTap;
public class Bai17 
{
	public void KiemTra(int n)
	{
		int fib1 = 1, fib2 = 1, fib =2;
		while(fib1 + fib2 <= n)
		{
			fib = fib1 + fib2;
			fib2 = fib1;
			fib1 = fib;
		}
		if(fib == n ) System.out.println("So "+n+ " la so fibonacci");
		else System.out.println("So "+n+ " khong la so fibonacci");
	}
	public static void main (String [] s)
	{
		Bai17 dt = new Bai17();
		dt.KiemTra(17);
		dt.KiemTra(55);
	}
}
