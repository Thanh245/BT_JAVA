//So chinh phuong
package BaiTap;
public class Bai12 
{
	public void KiemTra(int n)
	{
		int i, ok = 0;
		for (i = 1; i <= Math.sqrt(n); i++)
		if (i*i == n) 
		{	
			ok = 1; break;
		}	
		if(ok!= 0) System.out.println ("So " +n+ " la so chinh phuong");
		else System.out.println ("So " +n+ " khongla so chinh phuong");
	
	}
	public static void main (String [] s)
	{
		Bai12 P = new Bai12();
		P.KiemTra(16);
		P.KiemTra(7);
	}

}
