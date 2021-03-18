//So trung gian
package BaiTap;
public class Bai3
{
	public void TimTG(int a, int b, int c)
	{
		int max, min, mid;
		max = (a>b && a>c) ? a:(b>c? b:c);
		min = (a<b && a<c) ? a:(b<c? b:c);
		mid = a+b+c - max -min;
		System.out.println("So trung gian la: " +mid);
	}
	public static void main (String s[])
	{
		Bai3 dt = new Bai3();
		dt.TimTG(4,5,6);
		dt.TimTG(12,17,7);
	}
}