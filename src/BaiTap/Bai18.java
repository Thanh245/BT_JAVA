//Tim UCLN va BCNN cua a, b
package BaiTap;
public class Bai18 
{
	public int UCLN (int a, int b)
	{
		if (a%b!=0) return UCLN(b,a%b);
		else return b;
	}
	public int BCNN (int a, int b)
	{
		return (a*b)/UCLN(a,b);
	}
	public static void main(String [] s)
	{
		Bai18 dt = new Bai18();
		
		System.out.println("UCLN cua 9 va 15 la " + dt.UCLN(9,15));
		System.out.println("BCNN cua 9 va 15 la " + dt.BCNN(9,15));
	}
}
