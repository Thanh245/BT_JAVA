//Gia phuong trinh bac 2 ax^2+bx+c=0
package BaiTap;
public class Bai2 
{
	public void Gpt (int a, int b, int c)
	{
		System.out.println("Phuong trinh "+a+"x^2 + "+b+"x + " +c+ " = 0");
		float x1, x2, dt;
		if (a == 0)
		{
			if (b == 0)
			{
				if (c == 0) System.out.println("Co vo so nghiem\n");
				else System.out.println("Vo nghiem\n");
			}
			else System.out.println("Co nghiem x = " +-c/b+ "\n");
		}
		else
		{
			dt = b*b - 4*a*c;
			if (dt < 0) System.out.println("Vo nghiem\n");
			else if (dt == 0) 
			{
				x1 = -b/(2*a);
				System.out.println("Co nghiem kep x1 = x2 = " +x1+ "\n");
			}
			else
			{
				x1 = (float) ((-b + Math.sqrt(dt))/(2*a));
				x2 = (float) ((-b - Math.sqrt(dt))/(2*a));
				System.out.println(" Co hai nghiem phan biet:");
				System.out.println("x1 = " +x1);
				System.out.println("x2 = " +x2+ "\n");
			}
		}
	}
	public static void main (String [] s)
	{
		Bai2 dt = new Bai2();
		dt.Gpt(0,0,1);
		dt.Gpt(0, 0, 0);
		dt.Gpt(1, 4, 4);
		dt.Gpt(1, -8, 15);
	}
}
