package CacLuongIO;
import java.io.*;
public class ChuoiKyTu 
{
	public String nhapchuoi() throws IOException
	{
		InputStreamReader luongvao = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(luongvao);
		String s = br.readLine();
		return s;
	}
	public String ChuoiDao(String s)
	{
		String s1 = " ";
		char c;
		for (int i = s.length()-1; i >=0; i--)
		{
			c = s.charAt(i);
			s1 = s1 + c;
		}
		return s1;
	}
	public String ChuoiHoa(String s)
	{
		String s2 = " ";
		char c;
		for (int i = 0; i<= s.length()-1; i++)
		{
			c = s.charAt(i);
			if(c >= 'a' && c<= 'z')
			{
				c -= 32;
				s2 = s2 + c;
			}
			else s2 = s2 + c;
		}
		return s2;
	}
	public String ChuoiThuong(String s)
	{
		String s3 = " ";
		char c;
		for (int i = 0; i<= s.length()-1; i++)
		{
			c = s.charAt(i);
			if(c >= 'A' && c<= 'Z')
			{
				c += 32;
				s3 = s3 + c;
			}
			else s3 = s3 + c;
		}
		return s3;
	}
	public String ChuoiHoaThuong(String s)
	{
		String s4 = " ";
		char c;
		for (int i = 0; i<= s.length()-1; i++)
		{
			c = s.charAt(i);
			if(c >= 'a' && c<= 'z')
			{
				c -= 32;
				s4 = s4 + c;
			}
			else if(c >= 'A' && c<= 'Z')
			{
				c += 32;
				s4 = s4 + c;
			}
			else s4 = s4 + c;
		}
		return s4;
	}
	public static void main(String arg[])
	{
		ChuoiKyTu dt = new ChuoiKyTu();
		String s = " ";
		try
		{
			System.out.print("Nhap mot chuoi bat ki: ");
			s = dt.nhapchuoi();
		}catch(Exception e) {}
		System.out.println("Chuoi da nhap: "+s);
		System.out.println("Chuoi dao la :"+dt.ChuoiDao(s));
		System.out.println("Chuoi hoa la :"+dt.ChuoiHoa(s));
		System.out.println("Chuoi thuong la:"+dt.ChuoiThuong(s));
		System.out.println("Chuoi vua hoa vua thuong la:"+dt.ChuoiHoaThuong(s));
	}
}
