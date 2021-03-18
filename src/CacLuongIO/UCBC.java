//Tim UCLN va BCNN cua hai so a, b
package CacLuongIO;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
public class UCBC 
{
	public int nhapso() throws IOException
	{
		InputStreamReader luongvao = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(luongvao);
		String s = br.readLine();
		return Integer.parseInt(s);
	}
	public int UCLN (int a, int b)
	{
		if (a%b!=0) return UCLN(b,a%b);
		else return b;
	}
	public int BCNN (int a, int b)
	{
		return (a*b)/UCLN(a,b);
	}
	public static void main (String arg[])
	{
		UCBC dt = new UCBC();
		int a = 0, b = 0;
		try
		{
			do
			{
				System.out.print("Nhap vao so thu nhat: ");
				a=dt.nhapso();
			}while (a<=0);
		}catch(Exception e) {}
		try
		{
			do
			{
				System.out.print("Nhap vao so thu hai : ");
				b=dt.nhapso();
			}while (b<=0);
		}catch(Exception e) {}
		System.out.println("So thu nhat la: "+a);
		System.out.println("So thu hai la : "+b);
		System.out.println("UCLN cua "+a+" va "+b+" la " + dt.UCLN(a,b));
		System.out.println("BCNN cua "+a+" va "+b+" la " + dt.BCNN(a,b));
	}
}